/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author tange4315
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    // create a method to produce a pattern of random number of asterisks between 1 and 5 along the page
    public static void chaotic(int number) {

        // create an empty variable to store a random number
        int randomNumber = 0;

        // generate random numbers for producing asterisks based on the number entered
        for (int i = 0; i < number - 1; i++) {
            randomNumber = (int) (Math.random() * (6 - 1 + 1)) + 1;
            // print asterisks
            for (int j = 0; j < randomNumber - 1; j++) {
                if (j == 0) {
                    // start a new line of asterisks
                    System.out.println("* ");
                } else {
                    // make sure asterisks are printed on the same line
                    System.out.print("* ");
                }
            }
        }
    }

    public static void main(String[] args) {
        chaotic(20);
    }
}
