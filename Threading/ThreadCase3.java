package Threading;

import java.lang.*;

//There are for case of Threading : 
// 3 . Perform multiple task from multiple thread

class Task1 extends Thread {

    @Override
    public void run() {
        System.out.println("Task 1 by Thread 1");
    }

}

class Task2 extends Thread {

    @Override
    public void run() {
        System.out.println("Task 2 by Thread 2");
    }

}

class Task3 extends Thread {

    @Override
    public void run() {
        System.out.println("Task 3 by Thread 3");
    }

}

public class ThreadCase3 {

    public static void main(String[] args) {

        Task1 t1 = new Task1();
        t1.start();

        Task2 t2 = new Task2();
        t2.start();

        Task3 t3 = new Task3();
        t3.start();

    }

}
