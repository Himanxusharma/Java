package Threading;

import java.lang.*;
//There are for case of Threading : 
// 2 . Perform single task from multiple thread

public class ThreadCase2 extends Thread {

    @Override
    public void run() {
        System.out.println("Task is done !!");

    }

    public static void main(String[] args) {

        ThreadCase2 t1 = new ThreadCase2();
        ThreadCase2 t2 = new ThreadCase2();
        t2.start();
        t1.start();

    }

}
