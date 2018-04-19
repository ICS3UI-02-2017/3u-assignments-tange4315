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
        
        // create an array to represent numbers 0 to 1000
        int numbers[] = new int[1001];
        
        // fill the array with consecutive integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        
        // create an array to store booleans to determine prime numbers
        boolean prime[] = new boolean[1001];
        
        // assume all numbers are prime
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        
        // initially let p equal 2
        int p = 2;
        
        // go through array and look for composite numbers
        for (int i = 0; i < numbers.length; i++) {
            // mark all composite numbers in array
            if (numbers[i] % p == 0) {
                prime[i] = false;
            }
            // do not let p equal anything that's marked as composite
            for (int j = i; j < numbers.length; j++) {
                if (prime[j] == false) {
                    j++;
                } else {
                    p = numbers[j];
                }
            }
        }
        
        // tell user the prime numbers
        System.out.println("The prime numbers throughout 2 to 1000 are: ");
        
        for (int i = 0; i < numbers.length; i++) {
            if (prime[i] == true) {
                System.out.print(numbers[i] + " ");
            }
        }
        
    }
}