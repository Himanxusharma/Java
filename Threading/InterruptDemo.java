package Threading;


public class InterruptDemo extends Thread {
    
     public void run()
     {
        try {
            
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
                Thread.sleep(1000);
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
