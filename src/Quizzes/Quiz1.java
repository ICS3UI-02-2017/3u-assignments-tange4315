/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tange4315
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a city for the robot
        City kw = new City();
        
        // create a robot to put in kw
        RobotSE robot = new RobotSE(kw, 4, 0, Direction.EAST);
        
        // build a staircase
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        
        // put lightbulbs on staircase
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        
        // move robot up staircase and pick lightbulbs up along the way
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.pickThing();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.pickThing();
        
        // move robot down staircase and put lightbulbs along the way
        robot.move();
        robot.putThing();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.putThing();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.putThing();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.move();
        robot.putThing();
        robot.turnLeft();
        robot.move();
        
    }
}
