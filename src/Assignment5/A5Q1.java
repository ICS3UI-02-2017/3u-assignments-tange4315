/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author tange4315
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a scanner to read information
        Scanner input = new Scanner(System.in);

        // repeat the translator
        while (true) {

            // ask user for a word to translate
            System.out.println("Enter a word to translate: ");
            String origWord = input.nextLine();

            // sanitize the input
            origWord = origWord.toLowerCase();

            // find the length of the word
            int length = origWord.length();

            // store the translated word and individual letters in a variable;
            String transWord = "";
            String letter = "";

            // go through each letter of the word individually to detect vowels
            for (int i = 0; i < length; i++) {

                // ignore if letter is a consonant
                if (origWord.charAt(i) != 'a'
                        || origWord.charAt(i) != 'e'
                        || origWord.charAt(i) != 'i'
                        || origWord.charAt(i) != 'o'
                        || origWord.charAt(i) != 'u') {
                    // add letter to translated word
                    letter = origWord.substring(i, i);
                    transWord = transWord + letter;
                } else {
                    // add ub before a singular vowel
                    letter = origWord.substring(i, i);
                    transWord = transWord + "ub" + letter;
                }
                
                // don't add ub if next letter is a vowel
                if (origWord.charAt(i + 1) == 'a'
                        || origWord.charAt(i + 1) == 'e'
                        || origWord.charAt(i + 1) == 'i'
                        || origWord.charAt(i + 1) == 'o'
                        || origWord.charAt(i + 1) == 'u') {
                    // add letter to translated word
                    letter = origWord.substring(i, i);
                    transWord = transWord + letter;
                    // don't add ub if next letter is a vowel
                    if (origWord.charAt(i + 2) == 'a'
                            || origWord.charAt(i + 2) == 'e'
                            || origWord.charAt(i + 2) == 'i'
                            || origWord.charAt(i + 2) == 'o'
                            || origWord.charAt(i + 2) == 'u') {
                        // add letter to translated word
                        letter = origWord.substring(i, i);
                        transWord = transWord + letter;
                    }
                }
            }
        }

         // tell user their translated word
         System.out.println(transWord);

    }
}