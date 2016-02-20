package org.usfirst.frc.team4189.robot;

import edu.wpi.first.wpilibj.AnalogInput;
//import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4189.robot.commands.ShooterChangeState;
import org.usfirst.frc.team4189.robot.commands.SquareUp;




/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	//Joysticks
	public static Joystick leftStick = new Joystick(RobotMap.leftStick);
	public static Joystick rightStick = new Joystick(RobotMap.rightStick);
	public static Joystick accessoryStick = new Joystick(RobotMap.accessoryStick);
	
	//Analog Inputs
	public static AnalogInput rangeFinder1 = new AnalogInput(0);
	public static AnalogInput rangeFinder2 = new AnalogInput(1);
	public static AnalogInput rangeFinder3 = new AnalogInput(2);
	//public static AnalogGyro gyro = new AnalogGyro(3);
	
	//Buttons
	public static Button resetGyro = new JoystickButton(OI.leftStick , 2);
	
	public static Button shooterUp = new JoystickButton(OI.accessoryStick , 5);
	public static Button shooterDown = new JoystickButton(OI.accessoryStick , 3);
	public static Button portcullis = new JoystickButton(OI.accessoryStick , 4);
	public static Button shooterScoop = new JoystickButton(OI.accessoryStick , 7);
	public static Button lifterUp = new JoystickButton(OI.accessoryStick , 6);
	public static Button winchUp = new JoystickButton(OI.leftStick , 3);
	public static Button shooterShoot = new JoystickButton(OI.accessoryStick , 1);
	//public static Button squareUp = new JoystickButton(OI.leftStick , 3);
	public static Button introBall = new JoystickButton(OI.accessoryStick , 2);
	public static Button lifterDown = new JoystickButton(OI.accessoryStick , 8);
	public static Button portcullisDown = new JoystickButton(OI.accessoryStick , 9);
	public static Button resetIntroBall = new JoystickButton(OI.accessoryStick , 12);
	public static Button winchDown = new JoystickButton(OI.leftStick , 2);
	
	

    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    // button.whenPressed(new ExampleCommand());
    // button.whileHeld(new ExampleCommand());
    // button.whenReleased(new ExampleCommand());
	 
	public OI(){
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
	 }
}


