/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    
    // create a method to return the balance of an account after the compound interest is added
    public static double compoundInterest(double initialPrinciple, double interestRate, int numberOfYears) {
        // calculate the balance
        double balance = initialPrinciple * Math.pow(1 + interestRate, numberOfYears);
        // return the balance
        return balance;
    }
    
    public static void main(String[] args) {
        
    }
}
