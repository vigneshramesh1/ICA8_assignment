/*
    Created by Vignesh Ramesh on 27th Oct 2022

 */

package org.example;

import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {
        ValidityChecker validityChecker = new ValidityChecker();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: ");
        System.out.println("1. Check valid urinal count" + "\n" +
                "-1. Exit");
        int input = sc.nextInt();
        while(input != -1){
            if(input == 1){
                System.out.println("Enter string: ");
                String s = sc.next();
                if(!validityChecker.checkString(s)){
                    System.out.println("Invalid string.");
                }
                System.out.print("Valid urinal count: ");
                System.out.println(validityChecker.checkUrinalValidity(s));
            }
            System.out.println("Enter choice: ");
            System.out.println("1. Check valid urinal count" + "\n" +
                    "-1. Exit");
            input = sc.nextInt();
        }
    }
}