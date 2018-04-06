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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // create an array
        int A[] = new int[2];
        
        // tell user to input two integers
        System.out.println("Enter two integers: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        
        // arrange integers in array in ascending order
        if (A[0] > A[1]) {
            int lowInt = A[1];
            A[1] = A[0];
            A[0] = lowInt;
        }
        
        // tell user integers in ascending order
        System.out.println("The integers in ascending order are: " + A[0] + " " + A[1]);
        
    }
}
