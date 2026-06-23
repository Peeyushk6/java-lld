package threads;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FileDownloader implements Runnable{
    int fileId;

    public FileDownloader(int fileId){
        this.fileId = fileId;
    }

    public void run(){
        try{
            System.out.println("Downloading File "+ fileId);
            Thread.sleep(new Random().nextInt(2000));
            System.out.println("Download Complete"+ fileId);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class DownloadManger {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=0 ; i<=10 ; i++){
            executor.execute(new FileDownloader(i));
        }

        executor.shutdown();
    }
}
