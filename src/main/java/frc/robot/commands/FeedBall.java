package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.subsystems.Feeder;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class FeedBall extends CommandBase {

    String direction = "";

    private final Feeder m_feeder = new Feeder();
    
    public FeedBall(String direction) {
        addRequirements(m_feeder);
        this.direction = direction;
    }

    public FeedBall() {
        addRequirements(m_feeder);
    }


    // Called just before this Command runs the first time
    @Override
    public void initialize() {  

    } 

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        if(direction == "in") { 
        m_feeder.feedIn();	
        } else if(direction == "out") {
            m_feeder.feedOut();
        } else{
            m_feeder.feedIn();
        }
        System.out.println("Feeding!!!!");
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        m_feeder.stopFeeding();
    }
    
}