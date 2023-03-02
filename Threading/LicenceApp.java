package Threading;

class Medical extends Thread {

    public void run() {
        try {
            System.out.println("Medical Starts ...");
            Thread.sleep(3000);
            System.out.println("Medical Completed ...!! ");
        } catch (InterruptedException e) {

            System.out.println("Exception Occurs!!" + e);
        }
    }
}
class TestDriver extends Thread {
    public void run() {
        try {
            System.out.println("Drive Car for 3 Sec");
            Thread.sleep(3000);
            System.out.println("you passed the Driving Test ...!! ");
        } catch (InterruptedException e) {

            System.out.println("Exception Occurs!!" + e);
        }
    }
}

class Documentation extends Thread {
    public void run() {
        try {
            System.out.println("Documentation starts , Submit your Documents  !!! ");
            Thread.sleep(2000);
            System.out.println("Document Verified Successfully...!! ");
        } catch (InterruptedException e) {

            System.out.println("Exception Occurs!!" + e);
        }

    }
}

public class LicenceApp {
    public static void main(String[] args) throws InterruptedException{

        Medical med = new Medical();
        med.start();

        med.join();
        TestDriver td = new TestDriver();
        td.start();

        td.join();
        Documentation doc = new Documentation();
        doc.start();

    }

}
