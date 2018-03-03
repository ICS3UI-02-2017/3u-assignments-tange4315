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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // ask user to input four numbers on seperate lines
        System.out.println("Please enter 4 numbers on seperate lines: ");
        double numberOne = input.nextDouble();
        double numberTwo = input.nextDouble();
        double numberThree = input.nextDouble();
        double numberFour = input.nextDouble();
        
        // tell user their four numbers
        System.out.println("Your numbers were " + numberOne + ", " + numberTwo + ", " + numberThree + ", and " + numberFour);
        
    }
    
}
