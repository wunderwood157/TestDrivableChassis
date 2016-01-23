package org.usfirst.frc.team4189.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4189.robot.OI;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 */

public class Chassis extends Subsystem implements MotorSubsystem{
	public Victor victorR = new Victor(1);
	public Victor victorL = new Victor(3);
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	@Override
	public void set(double x) {
		victorL.set(x);
		victorR.set(x);
		// TODO Auto-generated method stub
		
	}

}

