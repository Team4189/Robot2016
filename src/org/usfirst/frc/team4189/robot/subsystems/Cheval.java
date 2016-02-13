package org.usfirst.frc.team4189.robot.subsystems;

import org.usfirst.frc.team4189.robot.RobotMap;
import org.usfirst.frc.team4189.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Cheval extends Subsystem {
    Talon chevalMotor = new Talon(RobotMap.chevalPort);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void setSpeed(double x) {
	chevalMotor.set(x);
    }
    
    public void initDefaultCommand() {
	setDefaultCommand(new DriveWithJoysticks());
	// Set the default command for a subsystem here.
	//setDefaultCommand(new MySpecialCommand());
    }
}

