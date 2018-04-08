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
        
        // calculate median if there are an even number of slots in array
        if (marks.length - marks.length == 1) {
            // find halfway point in array
            double half = marks.length / 2;
            // find two points that make up the middle
            double lowMedian = Math.floor(half);
            double highMedian = Math.ceil(half);
            double median = (lowMedian + highMedian) / 2;
            // round median to nearest hundreth
            median = (Math.round(median * 100.00) / 100.00);
        }
        
        // tell user the median of the class
        System.out.println(median);
        
    }
}
