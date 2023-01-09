package com.tmachinya.vowels.impl;

import com.tmachinya.vowels.ifaces.VowelsAvgCalculator;
import com.tmachinya.vowels.logic.Vowel;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class VowelsAvgCalculatorImp implements VowelsAvgCalculator {
    private final Vowel vowel;

    public VowelsAvgCalculatorImp(Vowel vowel) {
        this.vowel = vowel;
    }

    @Override
    public List<String> calculateAverage(String[] words) {
        List<String> list_of_words = new ArrayList<>();
        Stream<String> stream = Arrays.stream(words);
        HashMap<Integer, List<String>> map = stream
                .collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.toList()));
        for (HashMap.Entry<Integer, List<String>> entry : map.entrySet()) {
            Set<Character> set = new HashSet<>();
            List<Character> list = new ArrayList<>();
            double no_of_vowels, avg;
            int no_of_words;
            for (String str :
                    entry.getValue()) {
                for (int i = 0; i < str.length(); i++) {
                    if (this.vowel.isVowel(i,str.toLowerCase())) {
                        set.add(str.toLowerCase().charAt(i));
                        list.add(str.toLowerCase().charAt(i));
                    }
                }
            }
            no_of_vowels = list.size();
            no_of_words = entry.getValue().size();
            avg = no_of_vowels / no_of_words;
            String last = "(" + set + "," + entry.getKey() + ") -> " + avg + "  ";
            list_of_words.add(last);
        }
        return list_of_words;
    }
}
