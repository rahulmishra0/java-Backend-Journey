
class DownloadFile extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println("Downloading file....."+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class JoinDemo2 {
    public static void main(String[] args) throws InterruptedException {

        DownloadFile d1 = new DownloadFile();
        d1.start();

        Thread.sleep(300);
        //here sleep use interrupt the Thread
        //d1.interrupt();

        d1.join();
        System.out.println("Let me open a file...");
    }
}
