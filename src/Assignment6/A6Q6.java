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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // ask user for the size of the class
        System.out.println("How many students are in the class? ");
        int students = input.nextInt();
        
        // create an array to store marks
        int marks[] = new int[students];
        
        // ask user to input marks
        System.out.println("Please enter the marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        
        // calculate lowest mark
        
        // calculate highest mark
        
        // add all marks together
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        
        // calculate average
        double average = sum / students;
        
        // round average to nearest hundreth
        average = (Math.round (average * 100.0) / 100.00);
        
        // tell user the lowest mark, highest mark, and average
        System.out.println("The lowest mark is");
        
    }
}
