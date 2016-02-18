package org.usfirst.frc.team4189.robot.commands;

import org.usfirst.frc.team4189.robot.OI;
import org.usfirst.frc.team4189.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class ShooterChangeState extends Command {
	int state;
	
    public ShooterChangeState() {
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	state = 2;
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        	if (OI.shooterUp.get() == true){
        		state = state + 1;
        		SmartDashboard.putNumber("Shooter State", state);
        		System.out.println(state);
        		
        		
        	}
        	if (OI.shooterDown.get() == true){
        		state = state - 1;
        		SmartDashboard.putNumber("Shooter State", state);
        		
        	}
        	SmartDashboard.putNumber("Shooter State", state);
        	System.out.println(state);
        
        	
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
        SmartDashboard.putNumber("shooter angle encoder value", Robot.shooter.encGet());
        System.out.println(Robot.shooter.encGet());
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
