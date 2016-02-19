package org.usfirst.frc.team4189.robot.subsystems;

import org.usfirst.frc.team4189.robot.RobotMap;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Scissor extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Talon scissor = new Talon(RobotMap.scissorPort);
    
	public void setScissor(double x){
		scissor.set(x);
	}
	
	public void initDefaultCommand() {
    	
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

