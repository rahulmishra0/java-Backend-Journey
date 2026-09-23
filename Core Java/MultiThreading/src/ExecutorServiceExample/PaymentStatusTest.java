package ExecutorServiceExample;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

class PaymentStatus implements Callable<String>{
    int orderId;

    PaymentStatus(int orderId){
        this.orderId = orderId;
    }
    public String call() throws Exception{
        Thread.sleep(1000);
        return "Payment success for order" +orderId;
    }

}
public class PaymentStatusTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(new PaymentStatus(101));
        System.out.println("waiting for payment status...");
        String status = future.get();
        System.out.println(status);


        List<Callable<String>> tasks = Arrays.asList(
                () -> "total student : 500",
                () -> "total course : 123",
                () -> "total payment : 100"
        );

        List<Future<String>> res = executorService.invokeAll(tasks);

        for (Future<String> result : res){
            System.out.println(result.get());
        }

        executorService.shutdown();
    }

}
