package java_complete_reference.multithreading;

public class CMTJoin implements Runnable{
    Thread thread;
    String name;

    CMTJoin(String thread_name){
        name = thread_name;
        thread = new Thread(this, name);
        System.out.println("New Thread "+name);
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i> 0; i--){
                System.out.println(name+" : "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie){
            System.out.println(name+" is interrupted");
        }
    }
    public static void main (String ... arg){
        CMTJoin cmt = new CMTJoin("1");
        CMTJoin cmt2 = new CMTJoin("2");
        CMTJoin cmt3 = new CMTJoin("3");

        cmt.thread.start();
        cmt2.thread.start();
        cmt3.thread.start();

        System.out.println("Thread 1 is alive "+cmt.thread.isAlive());
        System.out.println("Thread 2 is alive "+cmt2.thread.isAlive());
        System.out.println("Thread 3 is alive "+cmt3.thread.isAlive());

        //wait for threads to finish
        try{
            System.out.println("waiting for threads to finish");
            cmt.thread.join();
            cmt2.thread.join();
            cmt3.thread.join();
        }catch (InterruptedException ie){
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread 1 is alive : " +cmt.thread.isAlive());
        System.out.println("Thread 2 is alive : " +cmt2.thread.isAlive());
        System.out.println("Thread 3 is alive : " +cmt3.thread.isAlive());

        System.out.println("Main thread is existing");
    }
}
