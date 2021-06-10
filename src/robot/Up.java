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
public class Up extends DirectionRobot{

    Up(Robot robot){
        super(robot);
    }
    
    @Override
    void move() {
        this.robot.position_verticale+=1;
    }

    @Override
    void goUp() {
        System.out.println("can't go that direction");
    }

    @Override
    void goDown() {
        System.out.println("can't go that direction");
    }

    @Override
    void goLeft() {
        robot.changeDirection(new Left(robot));
    }

    @Override
    void goRight() {
        robot.changeDirection(new Right(robot));
    }
    
}
