package java_complete_reference.multithreaded_programming;

public class CreatingChildThread2 extends Thread{
    public CreatingChildThread2(){
        // Creating a child Thread
        super("Creating Thread");
        System.out.println("Child Thread :" + this);
    }
    //Create Entry point for class by run()

    @Override
    public void run() {
        try{
            for (int i = 0; i <= 5; i++){
                System.out.println("child Thread "+i);
                Thread.sleep(500);
            }

        }catch (InterruptedException ie){
            System.out.println("child Thread is Interrupted "+ie);
        }
        System.out.println("Existing Child Thread");
    }
}
