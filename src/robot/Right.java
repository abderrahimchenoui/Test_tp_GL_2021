/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot;

/**
 *
 * @author aimen
 */
public class Right extends DirectionRobot{

    Right(Robot robot){
        super(robot);
    }
    
    @Override
    void move() {
        this.robot.position_horizantale +=1;
    }

    @Override
    void goUp() {
        robot.changeDirection(new Up(robot));
    }

    @Override
    void goDown() {
        robot.changeDirection(new Down(robot));
    }

    @Override
    void goLeft() {
        System.out.println("can't go that direction");
    }

    @Override
    void goRight() {
        System.out.println("can't go that direction");
    }
    
}
