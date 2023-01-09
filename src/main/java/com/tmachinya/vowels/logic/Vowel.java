package com.tmachinya.vowels.logic;

import org.springframework.core.io.ClassPathResource;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vowel {
    static final String loc = "src/main/resources/data/input.txt";
    static final String loc2 = "src/main/resources/data/output.txt";
    public static List<String> readFile(File source) throws IOException{
        List<String> data = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while((s=reader.readLine())!=null){
                data.add(s);
            }
        }
        return  data;
    }
    public  static void writeFile(List<String> data, File destination) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination))){
            for (String s:
                 data) {
                writer.write(s);
            }
        }
    }

    public static void outputResult(String src) throws IOException{
        File source = new File(src);
        FileReader file = new FileReader(src);
        BufferedReader br = new BufferedReader(file);
        String line;
        String[] words = null;

        //Gets each line till end of file is reached
        while((line = br.readLine()) != null) {
            words = line.split("\\s+");
        }


        File destination = new File(loc2);
        List<String> data = readFile(source);
        List<String> st = new ArrayList<>();
        assert words != null;
        Stream<String> stream = Arrays.stream(words);
        HashMap<Integer, List<String>> map = stream
                .collect(Collectors.groupingBy(String::length, HashMap::new, Collectors.toList()));
        System.out.println(map);

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            Set<Character> set = new HashSet<>();
            List<Character> list = new ArrayList<>();
            double no_of_vowels, avg;
            int no_of_words;
            for (String str:
                    entry.getValue()) {
                for(int i = 0;i<str.length();i++){
                    if(str.toLowerCase().charAt(i)=='a'
                            |str.toLowerCase().charAt(i)=='e'
                            | str.toLowerCase().charAt(i)=='i'
                            |str.toLowerCase().charAt(i)=='o'
                            |str.toLowerCase().charAt(i)=='u'
                    ){
                        set.add(str.toLowerCase().charAt(i));
                        list.add(str.toLowerCase().charAt(i));
                    }
                }
            }
            no_of_vowels = list.size();
            no_of_words = entry.getValue().size();

            avg = no_of_vowels/no_of_words;

            String last =  "("+set+","+entry.getKey()+") -> "+avg+"  ";
            st.add(last);

        }

        writeFile(st,destination);

    }
    public static void main(String[] args) throws IOException {
        outputResult(loc);
    }

}
