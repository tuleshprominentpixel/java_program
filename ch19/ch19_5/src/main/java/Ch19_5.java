import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;


public class Ch19_5 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "first";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Second";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "third";
            }
        });

        java.util.List<Future<String>> futures = executorService.invokeAll(callables);

        for(Future<String> future : futures){
            System.out.println("future.get = " + future.get());
        }

        executorService.shutdown();
    }
}
