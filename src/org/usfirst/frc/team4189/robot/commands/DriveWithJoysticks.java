package org.usfirst.frc.team4189.robot.commands;

import org.usfirst.frc.team4189.robot.OI;
import org.usfirst.frc.team4189.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class DriveWithJoysticks extends Command {
	int state;

    public DriveWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	state = 2;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.setSpeed(OI.leftStick.getY() , OI.rightStick.getY());
    	
    }
    public int whatState(){
    	if (OI.shooterUp.get() == true){
    		state = state + 1;
    		SmartDashboard.putNumber("Shooter State", state);
    		return state;
    		
    	}
    	if (OI.shooterDown.get() == true){
    		state = state - 1;
    		SmartDashboard.putNumber("Shooter State", state);
    		return state;
    	}
    	SmartDashboard.putNumber("Shooter State", state);
    	return state;
    	
    }
    void goToState(int whatState){
    	if (whatState == 1 && Robot.shooter.encGet() < 100){
    		new ShooterUp();
    	}
    	if (whatState == 2 && Robot.shooter.encGet() < 0){
    		new ShooterUp();
    	}
    	if (whatState == 2 && Robot.shooter.encGet() > 0){
    		new ShooterDown();
    	}
    	if (whatState == 3 && Robot.shooter.encGet() > -100){
    		new ShooterDown();
    	}
    }
 
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//Robot.chassis.setSpeed(0, 0);
    	return false;
        
    }

    // Called once after isFinished returns true
    protected void end() {
    	//Robot.chassis.setSpeed(0, 0);
    	
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	//Robot.chassis.setSpeed(0, 0);
    }
}
