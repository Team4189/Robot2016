package org.usfirst.frc.team4189.robot.subsystems;

import org.usfirst.frc.team4189.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void changeAngleUp() {
	
    }
    
    public void changeAngleDown() {
	
    }
    
    public void loadShooter() {
	
    }
    
    public void fireShooter() {
	
    }
    
    public void initDefaultCommand() {
	// Set the default command for a subsystem here.
	//setDefaultCommand(new MySpecialCommand());
	setDefaultCommand(new DriveWithJoysticks());
    }
}