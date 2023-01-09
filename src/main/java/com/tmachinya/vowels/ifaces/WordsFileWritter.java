package com.tmachinya.vowels.ifaces;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public interface WordsFileWritter {
    void writeFile(List<String> data, File destination) throws IOException;
}
