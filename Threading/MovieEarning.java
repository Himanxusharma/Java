package Threading;

class earning extends Thread  {

    int total_seat = 0;
    public void run()
    {
        synchronized(this)
        {
        for (int i = 1; i <= 10; i++) {
            
            total_seat =total_seat+100;
        }

        this.notify();

    }
    }
}


public class MovieEarning{
    
    public static void main(String[] args)  throws InterruptedException  {
        
    
    earning e  = new earning();
    e.start();
    
    System.out.println("Total earning is "+e.total_seat+"rs");
    synchronized(e)
    {
        e.wait();
        System.out.println("Total earning is "+e.total_seat+"rs");
    }


    }



}
