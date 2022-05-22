package java_complete_reference.multithreading;

public class CreateThread implements Runnable{
    String name;//thread name
    Thread t;
    CreateThread (String tn){
        name = tn;
        t = new Thread(this, name);
        System.out.println("Thread "+t);
    }
    @Override
    public void run() {
        try{
            for (int i = 0; i <=5; i++ ){
                System.out.println("Thread "+name+" "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException ie){
            System.out.println("Thread "+name+" is interrupted" );
        }
        System.out.println("Thread "+name+" is Existing");
    }
    public static void main (String ... arg){
        CreateThread ct = new CreateThread("My Thread");
        ct.t.start();
    }
}
