/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author tange4315
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a city for the robot
        City kw = new City();

        // put a robot in kw
        RobotSE robot = new RobotSE(kw, 0, 2, Direction.WEST);

        // create a square in kw
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);

        // make robot move around square twice
        for (int move = 0; move < 2; move++) {
            robot.move(2);
            robot.turnLeft();
            robot.move(3);
            robot.turnLeft();
            robot.move(3);
            robot.turnLeft();
            robot.move(3);
            robot.turnLeft();
            robot.move();
        }

    }
}
