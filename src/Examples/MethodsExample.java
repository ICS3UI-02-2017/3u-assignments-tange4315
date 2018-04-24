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
public class MethodsExample {

    // methods must be inside of the class, but not inside of the main method
    // the helloWorld method to say hello
    public static void helloWorld() {
        System.out.println("Hello world!");
    }

    // the sayHello method to say hello to a user
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // the positiveQuadFormula to calculate the positive root of the quadratic formula
    public static double positiveQuadFormula(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double root = (-b + Math.sqrt(discriminant)) / (2 * a);
//        // or
//        double[] roots = quadFormula(a, b, c);
        // send back the root
        return root;
//        // or to return positive root
//        return roots[0];
    }

    // the QuadFormula to calculate the quadratic formula
    public static double[] quadFormula(double a, double b, double c) {
        // create the array to store both roots
        double roots[] = new double[2];
        // calculate the discriminant
        double discriminant = b * b - 4 * a * c;
        // calculate the roots
        roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
        roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
        // send back the root
        return roots;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Scanner to read information
        Scanner input = new Scanner(System.in);

        // call the helloWorld method
        helloWorld();

        // ask user for their name
        System.out.println("What is your name?");
        String user = input.nextLine();
        // call the sayHello method
        sayHello(user);

        // calculate the positive root by calling the positiveQuadFormula method
        double positiveRoot = positiveQuadFormula(1, -5, -50);
        // return the answer
        System.out.println("The positive root is " + positiveRoot);

        // calculate roots by calling the quadFormula method
        double[] roots = quadFormula(1, -5, -50);
        // return the roots
        System.out.println("The roots are " + roots[0] + " and " + roots[1]);

    }
}
