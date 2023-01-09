package com.tmachinya.vowels.impl;

import com.tmachinya.vowels.ifaces.WordsFileWritter;
import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Component
public class WordsFileWritterImp implements WordsFileWritter {
    @Override
    public void writeFile(List<String> data, File destination) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination))){
            for (String s:
                    data) {
                writer.write(s);
            }
        }
    }
}
