package java_complete_reference.multithreading;

public class RunMultipleThreads{
    public void runThreads(){
        //create threads by java_complete_reference.multithreading.CreateThread class obj..
        CreateThread ct1 = new CreateThread("one");
        CreateThread ct2 = new CreateThread("two");
        CreateThread ct3 = new CreateThread("three");

        // start al created threads
        ct1.t.start();
        ct2.t.start();
        ct3.t.start();

        try{
            //wait for other threads to end
            Thread.sleep(10000);
        }catch (InterruptedException ie){
            System.out.println("main thread interrupted.");
        }
        System.out.println("Existing main Thread.");
    }

}
