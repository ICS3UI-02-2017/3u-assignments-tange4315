/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tange4315
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city for the robot
        City kw = new City();

        // create a robot to put in kw
        RobotSE karel = new RobotSE(kw, 3, 0, Direction.EAST);

        // create hurdles for karel
        new Wall(kw, 3, 0, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 0, Direction.EAST);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 6, Direction.EAST);

        // create a 'finish line' for karel
        new Thing(kw, 3, 8);

        // move karel through the hurdles
        while (!karel.canPickThing()) {
            // move karel if front is clear
            if (karel.frontIsClear()) {
                karel.move();
                // if front is not clear, instruct karel to jump the hurdles
            } else {
                karel.turnLeft();
                karel.move();
                karel.turnRight();
                karel.move();
                karel.turnRight();
                karel.move();
                karel.turnLeft();
            }

        }

    }
}
