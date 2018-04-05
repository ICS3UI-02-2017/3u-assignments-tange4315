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

            // walk through each letter of the word to individually detect vowels
            for (int i = 0; i < length; i++) {

                // detect singular vowels and abb ub before
                if (origWord.charAt(i) == 'a'
                        || origWord.charAt(i) == 'e'
                        || origWord.charAt(i) == 'i'
                        || origWord.charAt(i) == 'o'
                        || origWord.charAt(i) == 'u') {
                    // add ub and singular vowel to translated word variable
                    transWord += "ub" + origWord.charAt(i);

                    // detect consecutive vowels but don't exceed original word length
                    if (i + 1 < length) {

                        // detect double vowels
                        if (origWord.charAt(i + 1) == 'a'
                                || origWord.charAt(i + 1) == 'e'
                                || origWord.charAt(i + 1) == 'i'
                                || origWord.charAt(i + 1) == 'o'
                                || origWord.charAt(i + 1) == 'u') {
                            // add second consecutive vowel to translated word variable
                            transWord += origWord.charAt(i + 1);
                            
                            // detect consecutive vowels but don't exceed original word length
                            if (i + 2 < length) {
                                
                                // detect triple vowels
                                if (origWord.charAt(i + 2) == 'a' ||
                                        origWord.charAt(i + 2) == 'e' ||
                                        origWord.charAt(i + 2) == 'i' ||
                                        origWord.charAt(i + 2) == 'o' ||
                                        origWord.charAt(i + 2) == 'u') {
                                    // add third consecutive vowel to translated word variable
                                    transWord += origWord.charAt(i + 2);
                                    
                                    // move onto next letter after triple vowel
                                    i++;
                                    
                                    // do not exceed length of original word
                                    if (i + 2 >= length) {
                                        break;
                                    }
                                }
                                
                            }
                            
                            // move onto next letter after double vowel
                            i++;

                            // do not exceed length of original word
                            if (i + 1 >= length) {
                                break;
                            }
                        }

                    }

                } else {
                    // add consonant to translated word varible
                    transWord += origWord.charAt(i);
                }

            }

            // tell user their translated word
            System.out.println(origWord + " in Ubbi Dubbi is " + transWord + ".");
            System.out.println("");

        }

    }
}