package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word using Latin alphabet: ");
        String word = sc.next();
        word = word.toLowerCase();
        int letterCounts[] = new int[26]; //jo alfabētā ir 26 burti. visus "a" saglabāsim masīva 0 elementā, visus "b" 1, visus "c" 3 etc.

        for (int i = 0; i<word.length(); i++) { //šeit atrod katru vārda burtu
            char letter = word.charAt(i);
            int index = letter - 97; //tiek izsaukta Ascii tabula, pēc tās sanāk, ka a=97, tāpēc, lai dabūtu a=0, jāatņem -97
            letterCounts[index]++; //šeit katrs burts skaitās uz priekšu, piem, tagad b!=98 pēc Ascii, bet gan 1
        }
//        for(int count : letterCounts) { //for each loop, kam vajag temporary variable, šeit: count. katrā iterācijā
//                                        // paņem masīva vērtību un execute the body
//            System.out.print(" " + count);
//        }

        for (int i =0; i<26; i++) { //šis ir tas pats, kas for each loop, tikai smukāks formatējums, tiek izdrukāts gan burts, gan skaits
            char letter = (char) (i+97);
            System.out.print(letter + ":" + letterCounts[i] + " ");
        }

    }
}
