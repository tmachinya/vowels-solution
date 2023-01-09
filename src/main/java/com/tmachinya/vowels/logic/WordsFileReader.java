package com.tmachinya.vowels.logic;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface WordsFileReader {
    List<String> readFile(File source) throws IOException;
}
