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
        int spots = 0;

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

        // Return 1 if there is only one spot available, 0 if no spots available
        if (str.length() == 1) {
            if (str.charAt(0) == '0') {
                spots = 1;
            }
            return spots;
        }

        // split input on character '1' to find empty spots
        String[] zeroes = str.split("1");

        if(zeroes.length == 1 && zeroes[0].length() == str.length()){
            spots=(zeroes[0].length()+1)/2;
//            System.out.println("all zeroes:" + (zeroes[0].length()+1)/2);
            return spots;
        }

        for(int i=0;i<zeroes.length;i++){
            if(zeroes[i].equals("")){
                continue;
            }
            if(i==0){
                spots+=zeroes[i].length()/2;
//                System.out.println("left zeroes:" + zeroes[i].length()/2);
                continue;
            }
            if(i==zeroes.length-1 && str.charAt(str.length()-1)=='0'){
                spots+=zeroes[i].length()/2;
//                System.out.println("right zeroes:" + zeroes[i].length()/2);
                continue;
            }
//            System.out.println("in between zeroes:" + (zeroes[i].length()-1)/2);
            spots += (zeroes[i].length()-1)/2;
        }
        return spots;
    }
}
