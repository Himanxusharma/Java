package Threading;

public class Thread1 {

    public static void main(String[] args) {
        Runnable thread1 = () -> {
            for (int i = 1 ; i < 11; i++) {
                System.out.println("The value of i " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };


        Thread t  = new  Thread(thread1);
        //t.setName("Himanshu");
        t.run();
        
    }

    private static Thread Thread(Runnable thread1) {
        return null;
    }



    }
    

