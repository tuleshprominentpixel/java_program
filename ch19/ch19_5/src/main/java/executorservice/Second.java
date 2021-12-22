package executorservice;

import java.util.concurrent.*;

public class Second {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        CallableTask task=new CallableTask(1,5);

        Future<Integer> submittedTask= executorService.submit(task);
        try {
            Integer result=submittedTask.get();
            System.out.printf("Total task in sleep time : "+result+" second");
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
