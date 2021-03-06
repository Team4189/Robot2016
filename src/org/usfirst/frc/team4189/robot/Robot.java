
package org.usfirst.frc.team4189.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.vision.AxisCamera;

import org.usfirst.frc.team4189.robot.commands.DriveForDistance;
import org.usfirst.frc.team4189.robot.commands.DriveForSquare;
import org.usfirst.frc.team4189.robot.commands.DriveWithJoysticks;
import org.usfirst.frc.team4189.robot.commands.ExampleCommand;
import org.usfirst.frc.team4189.robot.subsystems.Chassis;
import org.usfirst.frc.team4189.robot.subsystems.Cheval;
import org.usfirst.frc.team4189.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4189.robot.subsystems.Lifter;
import org.usfirst.frc.team4189.robot.subsystems.Shooter;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static OI oi;
	public static Chassis chassis = new Chassis();
	public static Lifter lifter = new Lifter();
	public static Shooter shooter = new Shooter();
	public static Cheval cheval = new Cheval();
	DriveWithJoysticks driveWithJoysticks;
   
	
		
	

    Command autonomousCommand;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		System.out.println("The Robot has begun initializing");
    	System.out.println("Version 1.0");
		oi = new OI();
        // instantiate the command used for the autonomous period
        autonomousCommand = new DriveForSquare();
        driveWithJoysticks = new DriveWithJoysticks();
        //chassis.dashData();
        System.out.println("The Robot has initialized");
       

    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
		chassis.dashData();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
        chassis.dashData();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        chassis.dashData();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        chassis.dashData();
        //Schedular.getinstance().add(new *command*)
        System.out.println(Chassis.leftMotor.getChannel());
        System.out.println(Chassis.rightMotor.getChannel());
        System.out.println(Lifter.winchMotor.getChannel());
        System.out.println(Lifter.scissorMotor.getChannel());
        System.out.println(Cheval.chevalMotor.getChannel());
        System.out.println(Shooter.shooterAngleMotor.getChannel());
        System.out.println(Shooter.shooterOperation.getChannel());
        System.out.println(Shooter.introBallMotor.getChannel());
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	chassis.dashData();

    }

    /**
     * This function is called periodically during operator control
     */
    
    
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
       // myDrive.tankDrive(OI.leftStick,  OI.rightStick);
		//Timer.delay(0.05);
        chassis.dashData();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
        chassis.dashData();
    }
}
