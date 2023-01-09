package com.tmachinya.vowels.impl;

import com.tmachinya.vowels.ifaces.WordsFileReader;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Component
public class WordsFileReaderImp implements WordsFileReader {
    @Override
    public String[] readFile(File source) throws IOException{
        String[] words = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while((s=reader.readLine())!=null){
                words = s.split("\\s+");
            }
        }
        return words;
    }
}
