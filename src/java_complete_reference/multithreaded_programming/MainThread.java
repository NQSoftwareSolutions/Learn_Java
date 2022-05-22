package java_complete_reference.multithreaded_programming;


/**
 * Todo: Purpose
 * we are going to understand main thread & controlling of main thread
 */

public class MainThread{
    public static void main(String... arg){
        Thread thread = Thread.currentThread();

        System.out.println("current thread name is "+thread);

        //Todo change the name of thread
        thread.setName("My first thread");
        System.out.println("After changing name thread name is : "+thread);

        try{
            for (int n =10 ; n > 0; n--){
                System.out.println(n);
                Thread.sleep(1000);
                // this method is important when we need time less then millis
                Thread.sleep(100,100);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted!");
        }
    }
}
