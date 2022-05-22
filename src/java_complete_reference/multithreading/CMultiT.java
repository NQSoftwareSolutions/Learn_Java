package java_complete_reference.multithreading;

public class CMultiT implements Runnable {
    Thread t;
    String nt;

    CMultiT(String tName){
        nt = tName;
        t= new Thread(this,nt);
        System.out.println(nt+" thread");
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--){
                System.out.println(nt +"\t"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie){
            System.out.println(nt+" Interrupted");
        }
        System.out.println(nt+"\t is interrupted");
    }
    public static void main(String... arg){
        CMultiT cmt = new CMultiT("T1");
        CMultiT cmt2 = new CMultiT("T2");
        CMultiT cmt3 = new CMultiT("T3");

        // start the threads
        cmt.t.start();
        cmt2.t.start();
        cmt3.t.start();

        try{
            for (int i = 5; i > 0 ; i--){
                // wait for other  threads to end
                Thread.sleep(10000);
            }
        }catch (InterruptedException ie){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("main Thread is existing");
    }
}

