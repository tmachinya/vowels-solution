package com.tmachinya.vowels;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileReaderTest {
    @Test
 void readFile(){
     String path = "src/test";
     File file = new File(path);
     String absolutePath = file.getAbsolutePath();
 }
}
