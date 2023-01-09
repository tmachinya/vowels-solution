package com.tmachinya.vowels.ifaces;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface WordsFileReader {
    String[] readFile(File source) throws IOException;
}
