package frc.robot;

public class cCommandRunner implements Runnable {

    private cCommand command;

    private long delayTime;

    public cCommandRunner(cCommand command, long delayTime) {
        this.command = command;

        this.delayTime = delayTime;
    }
    
    public void run()
    {
        command.init();
        
        while (true) {
            this.command.execute();

            try {
                Thread.sleep(this.delayTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
