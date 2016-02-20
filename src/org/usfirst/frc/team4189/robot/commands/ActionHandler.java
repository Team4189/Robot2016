package org.usfirst.frc.team4189.robot.commands;

import org.usfirst.frc.team4189.robot.OI;
import org.usfirst.frc.team4189.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ActionHandler extends Command {
	/*resetGyro.whileHeld(new ResetBopper());
	//squareUp.whenPressed(new SquareUp());
	lifterUp.whileHeld(new SetLifter());
	winchUp.whileHeld(new WinchUp());
	shooterUp.whileHeld(new ShooterUp());
	shooterDown.whileHeld(new ShooterDown());
	shooterShoot.whileHeld(new ShooterShoot());
	introBall.whileHeld(new IntroBall());
	shooterScoop.whileHeld(new ShooterScoop());
	portcullis.whileHeld(new ChevalMove());
	lifterDown.whileHeld(new LifterDown());
	portcullisDown.whileHeld(new ChevalUp());
				//CameraServer.getInstance().startAutomaticCapture(Robot.chassis.pixyCam);*/
    public ActionHandler() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (OI.lifterUp.get() == true){
    		Robot.lifter.setScissor(-.75);
    	}
    	if (OI.winchUp.get() == true){
    		Robot.lifter.setWinch(1);
    	}
    	if (OI.shooterUp.get() == true){
    		Robot.shooter.changeAngle(-1);
    	}
    	if (OI.shooterDown.get() == true){
    		Robot.shooter.changeAngle(1);
    	}
    	if (OI.shooterShoot.get() == true){
    		Robot.shooter.fireShooter(1);
    	}
    	if (OI.introBall.get() == true){
    		Robot.shooter.introBall(.5);
    	}
    	if (OI.shooterScoop.get() == true){
    		Robot.shooter.fireShooter(-1);
    	}
    	if (OI.portcullis.get() == true){
    		Robot.cheval.setSpeed(-1);
    	}
    	if (OI.lifterDown.get() == true){
    		Robot.lifter.setScissor(.5);
    	}
    	if (OI.portcullisDown.get() == true){
    		Robot.cheval.setSpeed(1);
    	}
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
