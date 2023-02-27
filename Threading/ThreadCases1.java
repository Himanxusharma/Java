package Threading;

import java.lang.*;
//There are for case of Threading : 
// 1 . Perform single task from single thread

public class ThreadCases1 extends Thread {

    @Override
    public void run() {
        System.out.println("Task 1 completed !!!");

    }

    public static void main(String[] args) { // Main Thread ( JVM )
        ThreadCases1 t = new ThreadCases1();
        t.start();
    }

}
