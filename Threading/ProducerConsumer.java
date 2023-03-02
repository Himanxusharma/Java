package Threading;


class item{

    int i;
    boolean produced = false;
    public synchronized void produced (int x)
    {
        if (produced) {
            try {
                wait();
            } catch (Exception e) {
            }
        } 
        i=x;
        produced = true;
        notify();


    }

    public synchronized void consume ()
    {
        if (!produced) {
            try {
                wait();
            } catch (Exception e) {
            }
        } 
        produced = false;
        notify();
    }
}






public class ProducerConsumer {
    
}
