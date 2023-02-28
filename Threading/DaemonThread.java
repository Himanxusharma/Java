package Threading;
import java.lang.*;
import java.rmi.server.SocketSecurityException;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;


class Test extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().isDaemon());
    }
}


public class DaemonThread {
    
    public static void main(String[] args) {
        System.out.println("Hello, This is main thread !!!");
        System.out.println(Thread.currentThread().isDaemon());

        Test t = new Test();
        t.setDaemon(true);
        t.start();


    }
}
