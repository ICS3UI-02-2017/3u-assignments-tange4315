/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author tange4315
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // create an array to represent numbers 0 to 1001 and to store boolean values
        boolean prime[] = new boolean[1001];
        // fill the array assuming all numbers are prime
        for (int i = 0; i < 1000; i++) {
            prime[i] = true;
        }
        
        // go through array looking for prime numbers
        // initially let p = 2, the first prime number
        for (int p = 2; p * p <= 1000; p++) {
            // if prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // update multiples of p
                // do not let p equal a marked number
                for (int i = p * 2; i <= 1000; i+= p) {
                    prime[i] = false;
                }
            }
        }
        
        // tell user the prime numbers
        System.out.println("The prime numbers from 2 to 1000 are: ");
        // tell user the prime numbers from 2 to 1000
        for (int i = 2; i <= 1000; i++) {
            if (prime[i] == true) {
                // print numbers out on the same line
                System.out.print(i + " ");
            }
        }
    }
}