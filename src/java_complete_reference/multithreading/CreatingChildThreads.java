package java_complete_reference.multithreading;

public class CreatingChildThreads implements Runnable {
    Thread thread;

    CreatingChildThreads() {
        //creating new Thread
        thread = new Thread(this, "my new thread");
        System.out.println("New Thread name is " + thread);
    }

    //Entry point for new thread
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Child Thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread is interrupted " + e);
        }
        System.out.println("Existing Child Thread");
    }
}
