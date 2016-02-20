package org.usfirst.frc.team4189.robot;

import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4189.robot.commands.ChevalDown;
import org.usfirst.frc.team4189.robot.commands.ExampleCommand;
import org.usfirst.frc.team4189.robot.commands.IntroBall;
import org.usfirst.frc.team4189.robot.commands.ResetGyro;
import org.usfirst.frc.team4189.robot.commands.SetLifter;
import org.usfirst.frc.team4189.robot.commands.ShooterChangeState;
import org.usfirst.frc.team4189.robot.commands.ShooterDown;
import org.usfirst.frc.team4189.robot.commands.ShooterScoop;
import org.usfirst.frc.team4189.robot.commands.ShooterShoot;
import org.usfirst.frc.team4189.robot.commands.ShooterUp;
import org.usfirst.frc.team4189.robot.commands.SquareUp;
import org.usfirst.frc.team4189.robot.commands.WinchUp;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//Joysticks
	public static Joystick leftStick = new Joystick(RobotMap.leftStick);
	public static Joystick rightStick = new Joystick(RobotMap.rightStick);
	
	//Analog Inputs
	public static AnalogInput rangeFinder1 = new AnalogInput(0);
	public static AnalogInput rangeFinder2 = new AnalogInput(1);
	public static AnalogInput rangeFinder3 = new AnalogInput(2);
	//public static AnalogGyro gyro = new AnalogGyro(3);
	
	//Buttons
	public static Button resetGyro = new JoystickButton(OI.rightStick , 2);
	public static Button shooterUp = new JoystickButton(OI.rightStick , 6);
	public static Button shooterDown = new JoystickButton(OI.rightStick , 4);
	public static Button chevalDown = new JoystickButton(OI.rightStick , 5);
	public static Button shooterScoop = new JoystickButton(OI.rightStick , 1);
	public static Button lifterUp = new JoystickButton(OI.leftStick , 4);
	public static Button winchUp = new JoystickButton(OI.leftStick , 5);
	public static Button shooterShoot = new JoystickButton(OI.leftStick , 1);
	public static Button squareUp = new JoystickButton(OI.leftStick , 3);
	public static Button introBall = new JoystickButton(OI.leftStick , 2);
	

    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    // button.whenPressed(new ExampleCommand());
    // button.whileHeld(new ExampleCommand());
    // button.whenReleased(new ExampleCommand());
	 
	public OI(){
			resetGyro.whenPressed(new ResetGyro());
			squareUp.whenPressed(new SquareUp());
			lifterUp.whileHeld(new SetLifter());
			winchUp.whileHeld(new WinchUp());
			shooterUp.whenPressed(new ShooterChangeState());
			shooterDown.whenPressed(new ShooterChangeState());
			shooterShoot.whileHeld(new ShooterShoot());
			introBall.whenPressed(new IntroBall());
			shooterScoop.whileHeld(new ShooterScoop());
			chevalDown.whenPressed(new ChevalDown());
						//CameraServer.getInstance().startAutomaticCapture(Robot.chassis.pixyCam);
	 }
}


