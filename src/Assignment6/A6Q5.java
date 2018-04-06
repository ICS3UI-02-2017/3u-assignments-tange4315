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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // ask user to input amount of marks
        System.out.println("How many students are in the class? ");
        int students = input.nextInt();
        
        // create an array to store marks
        int marks[] = new int[students];
        
        // ask user to input marks
        System.out.println("Please enter the marks: ");
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextInt();
        }
        
        // sort array in ascending order
        
        // calculate median
        if (marks.length - marks.length == 1) {
            int half = marks.length / 2;
            
        }
        
        // tell user the median of the class
        System.out.println("The median is ");
        
    }
}
