package frc.robot;

public class DriveTrainTest implements cCommand{
    
    public void init() {}

    public void execute()
    {
        double throttle = 1;
        Robot.drivetrain.drive(-Robot.oi.getLeftStick().getY()*throttle, Robot.oi.getRightStick().getX());
    }
}
