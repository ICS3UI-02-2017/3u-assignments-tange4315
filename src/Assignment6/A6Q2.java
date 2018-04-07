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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // ask user how many people are participating
        System.out.println("How many people are participating? ");
        int numberOfPeople = input.nextInt();
        System.out.println("");
        
        // create an array to store the heights
        double heights[] = new double[numberOfPeople];
        
        // ask user to input the heights
        System.out.println("Enter the heights in centimetres: ");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }
        System.out.println("");
        
        // calculate average
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        double average = sum / numberOfPeople;
        
        // find people's height who are above their group's average
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > average) {
                // tell user the people's height that are above average
                System.out.println(heights[i] + " cm is above average in this group.");
            }
        }
        
    }
}
