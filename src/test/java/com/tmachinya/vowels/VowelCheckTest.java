package com.tmachinya.vowels;

import com.tmachinya.vowels.impl.VowelCheckImp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VowelCheckTest {
    @Test
    public void checkVowelTest() {
        VowelCheckImp checkVowel = new VowelCheckImp();
        assertTrue(checkVowel.isVowel(1,"testing"));
    }


}
