/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author tange4315
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city for the robot
        City kw = new City();

        // put a robot in kw
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST, 20);

        // make karel plant seeds in rows of 5
        for (int rowOfSeeds = 0; rowOfSeeds < 4; rowOfSeeds++) {
            for (int plantSeeds = 0; plantSeeds < 4; plantSeeds++) {
                karel.putThing();
                karel.move();
            }
            karel.putThing();
            // make karel turn around to plant another row of seeds
            karel.turnAround();
            karel.move(4);
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
        }

    }
}
