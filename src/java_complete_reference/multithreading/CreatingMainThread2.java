package java_complete_reference.multithreading;

public class CreatingMainThread2 {
    public void cmt (){
        CreatingChildThread2 creatingChildThread2 = new CreatingChildThread2();
        creatingChildThread2.start();

        try{
            for (int i = 0; i <= 5; i++){
                System.out.println("java_complete_reference.introduction.Main thread "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie){
            System.out.println("java_complete_reference.introduction.Main Thread Interrupted.");
        }
        System.out.println("Existing main Thread.");
    }
}
