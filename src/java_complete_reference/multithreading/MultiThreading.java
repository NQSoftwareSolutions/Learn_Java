package java_complete_reference.multithreading;

public class MultiThreading {

    public void helloMainThread() {
        //get main thread
        //Priority default value of main thread is "5"
        //name of this thread is "main"
        Thread mainThread = Thread.currentThread();
        System.out.println("java_complete_reference.introduction.Main thread is " + mainThread);
        //set the name of thread
        mainThread.setName("MyMainThread");
        //get the name of thread
        String threadName = mainThread.getName();
        System.out.println("Thread name after changing of Name " + threadName);
        try {
            for (int i = 0; i < 6; i++){
                System.out.println(i);
                //Wait one sec for 2nd looping cycle to come..
                //thread will sleep for one sec..
                //but it be interrupted by other thread so write in in try and catch block..
                //Sleep() method will suspend the execution of program for specified time in milli sec..
                //sleep() method can through InterruptedException so handle it by try and catch..
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is Interrupted "+e);
        }
    }
    public void creatingThread(){
        /*
        * we can create thread by Runnable Interface & Thread Class extension
        * easiest way is by creating class which implements runnable Interface by  implementing run() method
        * run() create entry point for other threads, & contains definition of thread..
        * thread will end when run() returns
        * When we implements Runnable class then we have to init Thread class with Constructor
        * New created thread will start to run with start().
         */
        CreatingMainThread creatingMainThread = new CreatingMainThread();
        creatingMainThread.runThread();
    }
    public void creatingThread2(){
        //create threads by extends Thread
        CreatingMainThread2 creatingMainThread2 = new CreatingMainThread2();
        creatingMainThread2.cmt();
    }
    public void crMultipleThreads(){
        RunMultipleThreads runMultipleThreads = new RunMultipleThreads();
        runMultipleThreads.runThreads();
    }
}
