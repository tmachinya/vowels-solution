package com.tmachinya.vowels.logic;

import org.springframework.stereotype.Component;

import java.io.*;
import java.util.List;
@Component
public class Vowel {

    public static void main(String[] args) throws IOException {
//        outputResult(loc);
    }

    public boolean isVowel(int i,String str){
        return str.toLowerCase().charAt(i) == 'a'
                | str.toLowerCase().charAt(i) == 'e'
                | str.toLowerCase().charAt(i) == 'i'
                | str.toLowerCase().charAt(i) == 'o'
                | str.toLowerCase().charAt(i) == 'u';
    }


}
