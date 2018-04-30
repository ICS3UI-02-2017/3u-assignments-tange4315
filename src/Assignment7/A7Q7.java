/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    
    // create a method that returns the first digit of an integer
    public static int firstDigit(int number) {
        // get rid of the negative sign if the number is negative
        if (number < 0) {
            number = number * -1;
        }
        // keep on removing the last digit of the number until only one digit is left
        while (number >= 10) {
            number /= 10;
        }
        // return the first digit
        return number;
    }
    
    public static void main(String[] args) {
        firstDigit(-123);
    }
}
