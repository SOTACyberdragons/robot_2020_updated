package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;


/**
 *
 */
public class ShootOut extends CommandBase {

    private final Shooter m_shooter = new Shooter();

    public ShootOut() {
        addRequirements(m_shooter);
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {  

    } 

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        m_shooter.shootOut();	
        System.out.println("Shooting!!!!");
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        m_shooter.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    
    
}