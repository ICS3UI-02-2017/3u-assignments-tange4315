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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // ask student for their name
        System.out.println("Please enter your name: ");
        String studentName = input.nextLine();

        System.out.println("");

        // ask student about their first test
        System.out.println("What was the first test out of?: ");
        double firstTest = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double firstTestMark = input.nextDouble();

        System.out.println("");

        // ask student about their second test
        System.out.println("What was the second test out of?: ");
        double secondTest = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double secondTestMark = input.nextDouble();

        System.out.println("");

        // ask student about their third test
        System.out.println("What was the third test out of?: ");
        double thirdTest = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double thirdTestMark = input.nextDouble();

        System.out.println("");

        // ask student about their fourth test
        System.out.println("What was the fourth test out of?: ");
        double fourthTest = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double fourthTestMark = input.nextDouble();

        System.out.println("");

        // ask student about their fifth test
        System.out.println("What was the fifth test out of?: ");
        double fifthTest = input.nextDouble();
        System.out.println("What mark did you get?: ");
        double fifthTestMark = input.nextDouble();

        System.out.println("");

        // find student's test scores
        double firstTestScore = firstTestMark / firstTest * 100;
        double secondTestScore = secondTestMark / secondTest * 100;
        double thirdTestScore = thirdTestMark / thirdTest * 100;
        double fourthTestScore = fourthTestMark / fourthTest * 100;
        double fifthTestScore = fifthTestMark / fifthTest * 100;

        // output student's test scores
        System.out.println("Test Scores for " + studentName);
        System.out.println("Test 1: " + firstTestScore + "%");
        System.out.println("Test 2: " + secondTestScore + "%");
        System.out.println("Test 3: " + thirdTestScore + "%");
        System.out.println("Test 4: " + fourthTestScore + "%");
        System.out.println("Test 5: " + fifthTestScore + "%");

        System.out.println("");

        // find student's average
        double studentAverage = (firstTestScore + secondTestScore + thirdTestScore + fourthTestScore + fifthTestScore) / 5;

        // output student's average
        System.out.println("Average: " + studentAverage + "%");

    }

}
