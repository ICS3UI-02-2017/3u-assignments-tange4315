/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */

    // make a method to calculate the area of a circle given the radius
    public static double areaCircle(double radius) {
        // calculate the area of a circle
        double areaCircle = Math.PI * Math.pow(radius, 2);
        // return the value to the user
        return areaCircle;
    }
    
    public static void main(String[] args) {
        double area = areaCircle(1);
        System.out.println("The area of a circle is " + area + ".");
    }
}
