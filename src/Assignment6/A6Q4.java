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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // create an array
        int marks[] = new int[10];
        
        // tell user to input 10 marks
        System.out.println("Please enter 10 marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        
        // sort in ascending order
        
        
    }
}
