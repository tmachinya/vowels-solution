package com.tmachinya.vowels;
import com.tmachinya.vowels.impl.WordsFileReaderImp;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;;

public class FileReaderTest {
    @Test
 void readFileTest() throws IOException {
        WordsFileReaderImp wordsFileReader = new WordsFileReaderImp();
        File source = new File("src/main/resources/data/input.txt");
        String[] words = wordsFileReader.readFile(source);
        assertArrayEquals(words, new String[]{"here","we","go"});
 }
}
