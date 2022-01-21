package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj2.command.CommandBase;


/**
 *
 */
public class SpinIntake extends CommandBase {
    private final Intake m_intake = new Intake();
    double speed;
    public SpinIntake(double speed) {
        addRequirements(m_intake);
        speed = this.speed;
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {  

    } 

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        m_intake.setIntakeSpeed(speed);	

    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        m_intake.stopMoving();
    }
}