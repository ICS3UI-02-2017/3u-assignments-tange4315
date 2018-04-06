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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // ask user how many students there are in the class
        System.out.println("How many students are in the class? ");
        int numberOfStudents = input.nextInt();

        // make an array to store the marks
        double marks[] = new double[numberOfStudents];
        
        // ask user to enter marks
        System.out.println("Enter the marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        
        System.out.println("");
        
        // add marks
        double average = 0;
        for (int i = 0; i < marks.length; i++) {
            average += marks[i];
        }
        
        // calculate average
        average = average / numberOfStudents;
        
        // round average to the nearest hundreth
        average = (Math.round(average * 100.0) / 100.0);
        
        // tell user the average
        System.out.println("The class average is " + average + "%.");
        
    }
}