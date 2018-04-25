/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    // create a method to determine a letter grade when given a percentage grade
    public static void examGrade(int examGrade) {
        if (examGrade < 50) {
            System.out.println("Your letter grade is F because your percentage grade is " + examGrade + ".");
        } else if (examGrade >= 50 && examGrade <= 59) {
            System.out.println("Your letter grade is D because your percentage grade is " + examGrade + ".");
        } else if (examGrade >= 60 && examGrade <= 69) {
            System.out.println("Your letter grade is C because your percentage grade is " + examGrade + ".");
        } else if (examGrade >= 70 && examGrade <= 79) {
            System.out.println("Your letter grade is B because your percentage grade is " + examGrade + ".");
        } else if (examGrade >= 80) {
            System.out.println("Your letter grade is A because your percentage grade is " + examGrade + ".");
        }
    }

    public static void main(String[] args) {
        examGrade(80);
    }
}
