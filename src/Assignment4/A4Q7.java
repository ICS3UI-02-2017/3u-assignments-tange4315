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
        
        // snakes and ladders begins on square 1
        int currentSquare = 1;
        int previousSquare = 1;
        
        // game continues until user reaches square 100
        while (currentSquare < 100) {
            
            // ask user what sum of dice is
            System.out.println("Enter sum of dice: ");
            int sumOfDice = input.nextInt();

            // terminate game if sum of dice is not in between 2 and 12
            if (sumOfDice < 2 || sumOfDice > 12) {
                System.out.println("You Quit!");
                System.exit(0);
            }
            
            // find out what square user is currently on
            currentSquare = currentSquare + sumOfDice;
            
            // user cannot go over square 100
            while (currentSquare > 100) {
                currentSquare = previousSquare;
                System.out.println("Enter sum of dice: ");
                sumOfDice = input.nextInt();
                currentSquare = currentSquare + sumOfDice;
                System.out.println("You are now on square " + currentSquare);
            }
            
            // find out if user can go down a snake
            if (currentSquare == 54) {
                currentSquare = 19;
            } else if (currentSquare == 90) {
                currentSquare = 48;
            } else if (currentSquare == 99) {
                currentSquare = 77;
            }
            
            // find out if user can go up a ladder
            if (currentSquare == 9) {
                currentSquare = 34;
            } else if (currentSquare == 40) {
                currentSquare = 64;
            } else if (currentSquare == 67) {
                currentSquare = 86;
            }
            
            // tell user which square they are on
            System.out.println("You are now on " + currentSquare);
            
            // tell user if they have won
            if (currentSquare == 100) {
                System.out.println("You Win!");
            }
            
            previousSquare = currentSquare;
            
        }

    }
}
