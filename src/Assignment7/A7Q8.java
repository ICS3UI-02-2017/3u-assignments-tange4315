/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    
    // create a method that returns whether every digit of a positive integer is odd
    public static boolean allDigitsOdd(int number) {
        // parse integer into a String
        String numberString = Integer.toString(number);
        // create a boolean variable assuming that all numbers in the integer are odd
        boolean odd = true;
        // use a for loop to go through the number
        for (int i = 0; i < numberString.length(); i++) {
            // detect an even number
            if (numberString.charAt(i) == '0' ||
                    numberString.charAt(i) == '2' ||
                    numberString.charAt(i) == '4' ||
                    numberString.charAt(i) == '6' ||
                    numberString.charAt(i) == '8') {
                // mark odd if a number in the integer is even
                odd = false;
            }
        }
        // return boolean value to user to determine whether if all digits were odd
        return odd;
    }
    
    public static void main(String[] args) {
        allDigitsOdd(1336);
    }
}
