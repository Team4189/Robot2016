package org.usfirst.frc.team4189.robot.subsystems;

import org.usfirst.frc.team4189.robot.RobotMap;
import org.usfirst.frc.team4189.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Shooter extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Talon shooterAngleMotor = new Talon(RobotMap.shooterAnglePort);
    Talon shooterOperation = new Talon(RobotMap.shooterPort);

    public void changeAngle(double x) {
	shooterAngleMotor.set(x);
	
	// Angle up.
	
	// Angle down.
    }
    
    public void fireShooter(double x) {
	shooterOperation.set(x);
	// Load shooter.
	
	// Fire shooter.
    }
    
    public void initDefaultCommand() {
	// Set the default command for a subsystem here.
	//setDefaultCommand(new MySpecialCommand());
	setDefaultCommand(new DriveWithJoysticks());
    }
}