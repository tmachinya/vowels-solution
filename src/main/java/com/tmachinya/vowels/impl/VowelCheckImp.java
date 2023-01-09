package com.tmachinya.vowels.impl;

import com.tmachinya.vowels.ifaces.VowelCheck;
import org.springframework.stereotype.Component;

@Component
public class VowelCheckImp implements VowelCheck {
    @Override
    public boolean isVowel(int i,String str){
        return str.toLowerCase().charAt(i) == 'a'
                | str.toLowerCase().charAt(i) == 'e'
                | str.toLowerCase().charAt(i) == 'i'
                | str.toLowerCase().charAt(i) == 'o'
                | str.toLowerCase().charAt(i) == 'u';
    }
}
