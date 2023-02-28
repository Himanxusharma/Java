package Threading;
import java.lang.*;


public class JoinDemo extends Thread {
    static Thread mainThread;
    public void run() 
    {
        try {
            
            mainThread.join();
            
        for (int i = 1; i < 6; i++) {
            System.out.println("Child Thread "+i);
            Thread.sleep(1000);

        }}
        catch(Exception interException)
        {
                System.out.println("Exception aa gyi bhai !!!");
        }



    }

    public static void main(String[] args) throws InterruptedException {
        
        mainThread = Thread.currentThread();
        JoinDemo jd= new JoinDemo();
        jd.start();

        //jd.join();

        for (int i = 1; i < 6; i++) {
            
            System.out.println("main Threas "+ i);
            Thread.sleep(1000);
            //jd.join();
        }
        


    }
}
