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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // make a Scanner to read information
        Scanner input = new Scanner(System.in);
        
        // ask user for their name
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        
        // greet user by name
        System.out.println("Hello " + name + ". How are you today?");
        
    }
    
}
