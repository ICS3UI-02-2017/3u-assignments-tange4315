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
        
        // create variable to temporarily store marks in
        int temporary = 0;
        
        // do not exceed array length when sorting marks
        for (int i = 0; i < marks.length - 1; i++) {
            // do not sort items that have been previously sorted
            for (int j = 0; j < marks.length - 1 - i; j++) {
                // switch places if current integer is higher than next integer
                if (marks[j] > marks[j + 1]) {
                    temporary = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temporary;
                }
            }
        }
        
        // tell user the marks in ascending order
        System.out.print("The marks in ascending order are: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        
    }
}
