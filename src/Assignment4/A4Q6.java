/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author tange4315
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // ask user what the speed limit is
        System.out.println("Enter the speed limit: ");
        int speedLimit = input.nextInt();

        // ask user what the recorded speed of the car is
        System.out.println("Enter the recorded speed of the car: ");
        int speed = input.nextInt();

        // create a variable to determine whether the user was speeding
        int speeding = speed - speedLimit;

        // tell user if they were within the speed limit
        if (speeding <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
            // tell user they were speeding if they were about speed limit and how much their fine is
        } else if (speeding <= 20) {
            System.out.println("You are speeding and your fine is $500.");
        } else if (speeding <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        } else if (speeding >= 31) {
            System.out.println("You are speeding and your fine is $500.");
        }

    }

}
