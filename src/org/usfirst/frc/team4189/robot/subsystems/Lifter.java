package org.usfirst.frc.team4189.robot.subsystems;

import org.usfirst.frc.team4189.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lifter extends Subsystem {
	
	Talon winchMotor = new Talon(RobotMap.winchPort);
	Talon scissorMotor = new Talon(RobotMap.scissorPort);
	
	public void setWinch(double x){
		winchMotor.set(x);
	}
    public void setScissor(double x){
    	scissorMotor.set(x);
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

