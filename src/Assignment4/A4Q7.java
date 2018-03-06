/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author tange4315
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // snakes and ladders starts on square one
        int squareOnBoard = 1;
        
        // ask user what sum of dice is
        System.out.println("Enter sum of dice: ");
        int sumOfDice = input.nextInt();
        
        // terminate game if sum of dice is not in between 2 and 12
        if (sumOfDice < 2 || sumOfDice > 12) {
            System.out.println("You Quit!");
            System.exit(0);
        }
        
        // find out which square user is on
        squareOnBoard = squareOnBoard + sumOfDice;
        
        // tell user to input sum of dice again if the square on board will be over 100
        if (squareOnBoard > 100) {
            System.out.println("Enter sum of dice: ");
            sumOfDice = input.nextInt();
        }
        
        // 
        
    }
}
