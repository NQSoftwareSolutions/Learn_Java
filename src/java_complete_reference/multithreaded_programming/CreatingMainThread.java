package java_complete_reference.multithreaded_programming;

public class CreatingMainThread {
    public static void main(String... arg){
        runThread();
    }
    public static void runThread(){
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
