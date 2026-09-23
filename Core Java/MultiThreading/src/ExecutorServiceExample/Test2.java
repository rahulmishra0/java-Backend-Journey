package ExecutorServiceExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EmailTask implements Runnable{

    String studentEmail;
    EmailTask(String studentEmail){
        this.studentEmail = studentEmail;
    }

    @Override
    public void run() {
        System.out.println("Sending email to "+studentEmail+" by"
        +Thread.currentThread().getName());
    }
}
public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        String[] email = {
                "rahul@gmail.com",
                "divya@gmail.com",
                "rohit@gmail.com",
                "yuvi@gmail.com",
                "ram@gmail.com",
                "ashu@gmail.com",
        };
        for (String e : email){
            executorService.submit(new EmailTask(e));
        }

        executorService.shutdown();
    }
}
