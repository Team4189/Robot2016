package org.usfirst.frc.team4189.robot;

import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4189.robot.commands.ExampleCommand;
import org.usfirst.frc.team4189.robot.commands.LifterUp;
import org.usfirst.frc.team4189.robot.commands.ResetGyro;
import org.usfirst.frc.team4189.robot.commands.SquareUp;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick leftStick = new Joystick(RobotMap.leftStick);
	public static Joystick rightStick = new Joystick(RobotMap.rightStick);
	public static AnalogInput rangeFinder1 = new AnalogInput(0);
	public static AnalogInput rangeFinder2 = new AnalogInput(1);
	public static AnalogInput rangeFinder3 = new AnalogInput(2);
	public static AnalogGyro gyro = new AnalogGyro(3);
	public static Button resetGyro = new JoystickButton(OI.rightStick , 2);
	public static Button squareUp = new JoystickButton(OI.rightStick , 3);
	public static Button winchUp = new JoystickButton(OI.leftStick , 3);
	
	
	
	
	//// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	 public OI(){
			resetGyro.whenPressed(new ResetGyro());
			squareUp.whenPressed(new SquareUp());
			winchUp.whileHeld(new LifterUp());

			 //CameraServer.getInstance().startAutomaticCapture(Robot.chassis.pixyCam);
	 }
}


