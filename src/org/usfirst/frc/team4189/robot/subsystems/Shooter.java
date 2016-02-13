package org.usfirst.frc.team4189.robot.subsystems;

import org.usfirst.frc.team4189.robot.RobotMap;
import org.usfirst.frc.team4189.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
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
    Talon introBallMotor = new Talon(RobotMap.introBallPort);
    DigitalInput chanA = new DigitalInput(RobotMap.encA3Port);
    DigitalInput chanB = new DigitalInput(RobotMap.encB3Port);
    Encoder shooterEnc = new Encoder(chanA, chanB);
    
    public void changeAngle(double x) {
	shooterAngleMotor.set(x);
    }
    
    public void fireShooter(double x) {
	shooterOperation.set(x);
    }
    
    public void introBall(double x) {
	introBallMotor.set(x);
    }
    
    public double encGet() {
	return shooterEnc.getDistance();
    }
    
    public void initDefaultCommand() {
	// Set the default command for a subsystem here.
	//setDefaultCommand(new MySpecialCommand());
	setDefaultCommand(new DriveWithJoysticks());
    }
}