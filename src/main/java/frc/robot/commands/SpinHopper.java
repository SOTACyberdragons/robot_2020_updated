package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Hopper;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;


/**
 *
 */
public class SpinHopper extends CommandBase {

    double speed;
    private final Hopper m_hopper = new Hopper();

    public SpinHopper() {
        addRequirements(m_hopper);
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {  

    } 

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        m_hopper.setHopperSpeed();	
        System.out.println("Spinning Hopper!!!");
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        m_hopper.stopHopping();
    }
    
}