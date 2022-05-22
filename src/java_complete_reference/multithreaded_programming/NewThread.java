package java_complete_reference.multithreaded_programming;

public class NewThread implements Runnable{

    Thread thread;
    int j;

    public static void main (String... arg){
        NewThread nt = new NewThread();
        nt.thread.start();

        try{
            for (int n = 0; n <= 100 ; n++){
                Thread.sleep(100);
            }

        }catch (InterruptedException ie){
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Existing main Thread");
    }

    /**
     * This is a constructor of My  NewThread  class which will create
     * a child thread when we create object of this class
     */
    NewThread(){
        //create a new thread here
        thread = new Thread(this, "My Thread");
        System.out.println("Child Thread \t"+thread);
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i <= 100 ; i++){

                if (i % 2 == 0){
                    j = j + i;
                    System.out.println(i +"\t"+j);
                }

                Thread.sleep(50);
            }

        }catch (InterruptedException ie){
            System.out.println("Child thread Interrupted");
        }
        System.out.println("Existing child thread & \n Sum of All even numbers upto 100" +
                " is \t "+j);
    }
}
