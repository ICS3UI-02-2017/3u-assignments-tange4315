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
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }
        
        // create variable to temporarily store marks in while sorting array
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
        
        // find halfway point in array
        int half = marks.length / 2;
        
        // find media
        if (marks.length % marks.length == 0) {
            
            // find the other median in array
            int lowMedianPlace = half - 1;
            
            // find two medians in array
            int lowMedian = marks[lowMedianPlace];
            int highMedian = marks[half];
            
            // calculate media
            double media = (lowMedian + highMedian) / 2;
            
            // round median to nearest hundreth
            media = (Math.round(media * 100.00) / 100.00);
            
            // tell user the media of the class
            System.out.println("The media of the class is " + media + ".");
            
        } else {
            // find median in array
            int median = marks[half];
            
            // tell user the median of the class
            System.out.println("The median of the class is " + median + ".");
        }
        
    }
}