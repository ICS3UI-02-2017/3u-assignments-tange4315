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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // ask user about cost of food
        System.out.println("How much does the food for prom cost? :");
        double costOfFood = input.nextDouble();

        // ask user about cost of DJ
        System.out.println("How much does the DJ cost? :");
        double costOfDJ = input.nextDouble();

        // ask user about cost of hall
        System.out.println("How much does it cost to rent the hall? :");
        double costOfHall = input.nextDouble();

        // ask user about cost of decorations
        System.out.println("How much does decorations cost? :");
        double costOfDecorations = input.nextDouble();

        // ask user about cost of staff
        System.out.println("How much does it cost for staff? :");
        double costOfStaff = input.nextDouble();

        // ask user about miscellaneous costs
        System.out.println("How much for miscellaneous costs? :");
        double miscellaneousCost = input.nextDouble();

        System.out.println("");

        // find total cost of prom
        double totalCost = costOfFood + costOfDJ + costOfHall + costOfDecorations + costOfStaff + miscellaneousCost;

        // find how many tickets are needed to break even
        int costOfTicket = 35;
        double numberOfTickets = totalCost / costOfTicket;
        numberOfTickets = Math.ceil(numberOfTickets);

        // tell user the total cost and the amount of tickets required to break even
        System.out.println("The total cost is $" + totalCost + ". You need to sell " + numberOfTickets + " tickets to break even.");

    }
}
