package Threading;
import java.lang.*;
//There are for case of Threading : 
// 1 . Perform single task from multiple thread

public class ThreadCase2  extends Thread{
    
    @Override
    public void run()
    {
        System.out.println("Task is done !!");
    }

    public static void main(String[] args) {
        
    }




}
