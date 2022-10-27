/*
    Created by Vignesh Ramesh on 27th Oct 2022

 */

package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidityCheckerTest {

    ValidityChecker validityChecker = new ValidityChecker();

    @Test
    public void checkStringTest1(){
       assertFalse(validityChecker.checkString("abc"));
    }
}
