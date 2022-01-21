package frc.robot.commands;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.Intake;

public class MoveIntake extends CommandBase {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private String direction;
    private final Intake m_intake = new Intake();

    public MoveIntake(String direction) {
        addRequirements(m_intake);
        direction = this.direction;
    }
    
    // Called just before this Command runs the first time
    @Override
    public void initialize() {  
        if (direction == "up"){
            m_intake.moveIntake("up");
        } else if (direction == "down") {
           m_intake.moveIntake("down");
        }
        System.out.println("INtake moving!!!!");
    } 

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        
    }
    
    @Override
	public boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    
}
