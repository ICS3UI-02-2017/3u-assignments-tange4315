/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    
    // create a method to find numbers that are divisible by a given factor
    public static void factors(int factor) {
   
        // create an array to store numbers
        int numbers[] = new int[factor + 1];
        // fill the array with numbers from 0 to the factor
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        
        // tell user the numbers that are divisible by the factor
        System.out.println("The numbers from 0 to " + factor + " that are divisible by " + factor + " are: ");
        
        // go through the array and locate numbers that are divisible by the factor
        for (int i = 1; i < numbers.length; i++) {
            if (factor % numbers[i] == 0) {
                // print numbers that are divisible by the factor
                System.out.print(numbers[i] + " ");
            } 
        }
    }
    
    public static void main(String[] args) {
        factors(30);
    }
}
