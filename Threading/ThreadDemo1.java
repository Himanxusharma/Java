package Threading;



class Book implements Runnable{

    @Override
    public void run() {
        System.out.println("Second Thread : Do a Task.");
    }
    
}


public class ThreadDemo1 extends Thread {
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread("Name");
        t1.start();
        System.out.println("First Thread"+t1.getName());

        Thread t2 = new Thread(new Book(),"Name");
        t2.start();
        
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
    }
}
