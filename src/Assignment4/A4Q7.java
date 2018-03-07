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
        int square = 1;

        while (square < 100) {
            
            // ask user what sum of dice is
            System.out.println("Enter sum of dice: ");
            int sumOfDice = input.nextInt();

            // terminate game if sum of dice is not in between 2 and 12
            if (sumOfDice < 2 || sumOfDice > 12) {
                System.out.println("You Quit!");
                System.exit(0);
            }

            // find out which square user is on
            square = square + sumOfDice;

            // tell user to input sum of dice again if the square on board will be over 100
            if (square > 100) {
                System.out.println("Enter sum of dice: ");
                sumOfDice = input.nextInt();
            }

            // find out if user can go down a snake
            if (square == 54) {
                square = 19;
            } else if (square == 90) {
                square = 48;
            } else if (square == 99) {
                square = 77;
            }

            // find out if user can go up a ladder
            if (square == 9) {
                square = 34;
            } else if (square == 40) {
                square = 64;
            } else if (square == 67) {
                square = 86;
            }

            // tell user which square they are on
            System.out.println("You are now on " + square);

            // tell user when they have won snakes and ladders
            if (square == 100) {
                System.out.println("You Win!");
            }
            
        }

    }
}
