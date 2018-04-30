/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    // create a method that returns the last digit of an integer
    public static int lastDigit(int number) {
        // calculate last digit of a number
        int lastDigit = number % 10;
        // last digit cannot contain a negative number
        if (lastDigit < 0) {
            lastDigit = lastDigit * -1;
        }
        // return last digit
        return lastDigit;
    }

    public static void main(String[] args) {
        lastDigit(-7438);
    }
}
