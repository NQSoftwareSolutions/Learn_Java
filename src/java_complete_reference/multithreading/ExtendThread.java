package java_complete_reference.multithreading;

public class ExtendThread extends Thread{
    ExtendThread(){
        // create new & second Thread
        super("My second thread");
        System.out.println("Child Thread : "+this);
    }
    // Entry point for the second thread
    public void run(){
        try{
            for (int i = 5; i > 0; i--){
                System.out.println("child thread "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException ie){
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Existing Child Thread");
    }
    public static void main (String ... arg){
        // creating a main thread
        ExtendThread et = new ExtendThread();

        et.start();// starting a main thread

        try{
            for (int i = 5; i > 0 ; i--){
                System.out.println("main thread "+i);
                Thread.sleep(1000);// sleep for 1 second
            }
        }catch (InterruptedException ie){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Existing main thread");
    }
}
