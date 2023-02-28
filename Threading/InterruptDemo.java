package Threading;


public class InterruptDemo extends Thread {
    
     public void run()
     {
        try {
            
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
                //System.out.println(isInterrupted());
                System.out.println(Thread.interrupted()); //true and change to trur to false.
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().isInterrupted());
            }


        } catch (Exception e) {
            System.out.println("Exception occurs " + e);
        }
     }



     public static void main(String[] args) {
        InterruptDemo id = new InterruptDemo();
        id.start();
        id.interrupt();

     }





}
