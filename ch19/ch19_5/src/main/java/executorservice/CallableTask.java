package executorservice;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {
    private final int taskId;
    private final int loopCounter;
    private final Random random=new Random();

    public CallableTask(int taskId, int loopCounter) {
        this.taskId = taskId;
        this.loopCounter = loopCounter;
    }

    @Override
    public Integer call() throws Exception {
        int totalSleepTime=0;
        for(int i=0;i<=loopCounter;i++){
            try{
                int sleepTime=2;
//                int sleepTime=random.nextInt(3)+1;
                System.out.println("Task = "+this.taskId+" - Iteration = "+i+" os going to sleep for "+sleepTime+" second ");
                Thread.sleep(sleepTime*1000);
                totalSleepTime=totalSleepTime+sleepTime;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return totalSleepTime;
    }
}
