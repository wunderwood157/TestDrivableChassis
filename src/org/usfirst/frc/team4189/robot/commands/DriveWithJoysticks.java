package org.usfirst.frc.team4189.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4189.robot.OI;
import org.usfirst.frc.team4189.robot.Robot;
import org.usfirst.frc.team4189.robot.subsystems.Chassis;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class DriveWithJoysticks extends Command {
	public DriveWithJoysticks() {
        requires(Robot.chassis);
		// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.set(OI.stick1.getX());
    	
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
       
    	return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.set(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.chassis.set(0);
    }
}
