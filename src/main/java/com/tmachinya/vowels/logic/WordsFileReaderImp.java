package com.tmachinya.vowels.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WordsFileReaderImp implements WordsFileReader{
    @Override
    public List<String> readFile(File source) throws IOException{
        List<String> data = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while((s=reader.readLine())!=null){
                data.add(s);
            }
        }
        return  data;
    }
}
