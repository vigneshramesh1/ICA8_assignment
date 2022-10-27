/*
    Created by Vignesh Ramesh on 27th Oct 2022

 */

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {

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
}
