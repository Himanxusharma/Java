package Threading;

public class YieldTest extends Thread{
    
    public void run()
    {
        //Thread.yield(); Thread 0 stop ho jaye and main thread run krta rhe
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
            
        }
    }


    public static void main(String[] args){

        YieldTest yt = new YieldTest();
        yt.start();
        Thread.yield(); // if you want main method to stop and provide chance to other threads for execution
        

        for (int i = 1; i <= 5; i++) {
            
            System.out.println(Thread.currentThread().getName()+" - "+i);
            
        }
    }
}
