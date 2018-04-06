/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author tange4315
 */
public class ArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // make an array to store expenses
        double[] expenses = new double[6];
        
        // array to store expense names
        String[] names = {"food", "DJ", "hall rental", "decorations", "staff", "miscellaneous"};

        // let the user know to get the costs
        System.out.println("Please enter the six costs for prom: ");

        // use a for loop for input
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("How much did the " + names[i] + " cost?");
            expenses[i] = input.nextDouble();
        }

        // adding all the expenses
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            // add it to the sum
            sum += expenses[i];
        }

        // output stuff
        System.out.println("Prom costs " + sum);

        // take the sum, divide by 35, always round up
        double ticketsNeeded = Math.ceil(sum / 35);
        System.out.println("Need to sell " + ticketsNeeded);
    }
}
