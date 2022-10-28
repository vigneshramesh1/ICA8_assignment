/*
    Created by Vignesh Ramesh on 27th Oct 2022

 */

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UrinalsTest {

    ValidityChecker validityChecker = new ValidityChecker();

    @Test
    public void checkStringTest1(){
       assertFalse(validityChecker.checkString("abc"));
    }

    @Test
    public void checkStringTest2(){
        assertFalse(validityChecker.checkString("101010101010101010101"));
    }

    @Test
    public void checkStringTest3(){
        assertTrue(validityChecker.checkString("10101"));
    }

    @Test
    public void checkStringTest4(){
        assertTrue(validityChecker.checkString(""));
    }

    @Test
    public void checkUrinalValidityTest1(){
        assertEquals(-1, validityChecker.checkUrinalValidity("110"));
    }

    @Test
    public void checkUrinalValidityTest2(){
        assertEquals(0, validityChecker.checkUrinalValidity(""));
    }

    @Test
    public void checkUrinalValidityTest3(){
        assertEquals(   1, validityChecker.checkUrinalValidity("0"));
    }

    @Test
    public void checkUrinalValidityTest4(){
        assertEquals(   0, validityChecker.checkUrinalValidity("1"));
    }

    @Test
    public void checkUrinalValidityTest5(){
        assertEquals(   3, validityChecker.checkUrinalValidity("00000"));
    }

    @Test
    public void checkUrinalValidityTest6(){
        assertEquals(   5, validityChecker.checkUrinalValidity("00000101000000"));
    }

    @Test
    public void checkUrinalValidityTest7(){
        assertEquals(   6, validityChecker.checkUrinalValidity("000010001001000000"));
    }
}
