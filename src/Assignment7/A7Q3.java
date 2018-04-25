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
    
    public static void factors(int factor) {
        
        // create an array to store numbers
        int numbers[] = new int[factor + 1];
        
        // fill array with numbers from 0 to the given factor
        for (int i = 0; i < factor + 1; i++) {
            numbers[i] = i;
        }
        
        // create an array to store boolean values to mark divisible numbers
        boolean divisible[] = new boolean[numbers.length];
        
        // assume all numbers are divisible by the factor
        for (int i = 0; i < divisible.length; i++) {
            divisible[i] = true;
        }
        
        // go through numbers array and find things that are not divisible by the factor
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % factor != 0) {
                // mark numbers that are not divisible by the factor
                divisible[i] = false;
            }
        }
        
        // tell user the numbers that are divisible by the factor
        System.out.println("The numbers that are divisible by " + factor + " are: ");
        
        for (int i = 0; i < numbers.length; i++) {
            if (divisible[i] == false) {
                System.out.print(numbers[i] + " ");
            }
        }
        
    }
    
    public static void main(String[] args) {
        factors(10);
    }
}
