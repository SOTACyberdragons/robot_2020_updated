package frc.robot;

import java.util.ArrayList;

public class cScheduler {
    
    private ArrayList<Thread> scheduledCommands = new ArrayList<Thread>();

    public void schedule(cCommand command, long delayTime) 
    {
        cCommandRunner commandRunner = new cCommandRunner(command, delayTime);

        scheduledCommands.add(new Thread(commandRunner));
    }

    public int getNumberOfScheduledCommands()
    {
        return this.scheduledCommands.size();
    }

    public void runScheduledCommands()
    {
         for (Thread t : scheduledCommands) {
             t.start();
         }
    }
}
