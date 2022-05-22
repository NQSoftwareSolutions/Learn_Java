package java_complete_reference.multithreading;

public class CreatingMainThread {
    public void runThread(){
        CreatingChildThreads creatingChildThreads = new CreatingChildThreads();//Creating new thread class
         creatingChildThreads.thread.start();//Start the Thread
        try{
            for (int i = 0;i <=5; i++){
                System.out.println("java_complete_reference.introduction.Main Thread "+i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException ie){
            System.out.println("java_complete_reference.introduction.Main Thread is Interrupted "+ie);
        }
        System.out.println("Existing java_complete_reference.introduction.Main Thread..");
    }
}
