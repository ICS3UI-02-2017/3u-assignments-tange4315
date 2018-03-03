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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // ask user to input a measurement in inches
        System.out.println("Please enter the measurement in inches you wish to convert: ");
        double inches = input.nextDouble();

        // create a variable to calculate the amount of centimetres in an inch
        double amountOfCentimetres = inches * 2.54;

        // tell user the amount of centimetres that are in the amount of inches they inputed
        System.out.println(inches + " inches is the same as " + amountOfCentimetres + " cm");

    }

}
