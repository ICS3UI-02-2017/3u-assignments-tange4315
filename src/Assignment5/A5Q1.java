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

            // store the translated word in a variable
            String transWord = "";

            // walk through each letter of the word individually to detect vowels
            for (int i = 0; i < length; i++) {
                
                // ignore if letter is a consonant
                if (origWord.charAt(i) != 'a'
                        && origWord.charAt(i) != 'e'
                        && origWord.charAt(i) != 'i'
                        && origWord.charAt(i) != 'o'
                        && origWord.charAt(i) != 'u') {
                    // add consonant to translated word
                    transWord = transWord + origWord.charAt(i);
                } else {
                    // add ub before a singular vowel
                    transWord = transWord + "ub" + origWord.charAt(i);
                }

                // check to see if next letter is a vowel
                
                
            }

            // tell user their translated word
            System.out.println(origWord + " in Ubbi Dubbi is " + transWord + ".");
            System.out.println("");

        }

    }
    
}