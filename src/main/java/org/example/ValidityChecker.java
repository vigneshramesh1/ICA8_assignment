/*
    Created by Vignesh Ramesh on 27th Oct 2022

 */

package org.example;

public class ValidityChecker {

    // checks to see if the input is  a valid string of 0s and 1s with length less than 20
    Boolean checkString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) != '0' && str.charAt(i) != '1') || i >= 20) {
                return false;
            }
        }
        return true;
    }

    int checkUrinalValidity(String str) {
        // Invalid input
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == '1' && str.charAt(i) == '1') {
                return -1;
            }
        }

        // Return 0 for an empty input string
        if(str.length() == 0){
            return 0;
        }

        // Remaining implementation to be added
        return 0;
    }
}
