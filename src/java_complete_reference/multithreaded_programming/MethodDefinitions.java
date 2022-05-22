package java_complete_reference.multithreaded_programming;

public class MethodDefinitions {
    public static final void defFullMultithreading(){
        defMultiThreading();
        defMultitasking();
        defBenefits();
        defJavaThreadModel();
        defEvenLoopWithPolling();
        defStatesOfThreads();
    }
    public static final void defMultiThreading(){
        String definition =  "By \"java_complete_reference.multithreading\" we create A \"multipart program\" which can run concurrently with different path." +
                "\nMultithreading is alternative to create multiple processes." +
                "\nMultithreading is specialized form of Multitasking.";
        System.out.print(definition);
    }
    public static final void defMultitasking(){
        String definition =  "Multitasking refers to doing multiple tasks at one \n" +
                "\nThere are two types of multi tasking\n" +
                "Process base & Thread base\n" +
                "process-based multitasking is the feature that allows your\n" +
                "computer to run two or more programs concurrently\n" +
                "In process-based multitasking,\n" +
                "a program is the smallest unit of code that can be dispatched by \nthe scheduler.\n" +
                "thread-based multitasking environment, the thread is the smallest\n unit\n" +
                "of dispatchable code. This means that a single program can perform \ntwo or\n" +
                "more tasks simultaneously. For instance, a text editor can format\n text at the\n" +
                "same time that it is printing, as long as these two actions are \nbeing performed\n" +
                "by two separate threads.";
        System.out.print(definition);
    }
    public static final void defBenefits(){
        String definition =  "Multitasking threads require less overhead \n" +
                "than multitasking processes.\n" +
                "Processes are heavyweight tasks that require their own \n" +
                "separate address spaces.\n" +
                "Interprocess communication is expensive and limited.\n" +
                "Context switching from one process to another is also costly.\n" +
                "Threads are lighter weight.\n" +
                "Threads share the same address space and cooperatively\n" +
                " share the same heavyweight process.\n" +
                "Interthread communication is inexpensive, and context " +
                "switching from one thread to the next is lower in cost.\n" +
                "Java uses process based multitasking which is not in its control \nbut " +
                "Thread base multitasking is in the control of java.\n" +
                "Multithreading enables you to write efficient programs that " +
                "make maximum use of the processing power available in the system.\n" +
                "Multithreading keeps IDle time to Minimum which is very for data \ntransmission" +
                "over network.\n" +
                "";
        System.out.print(definition);
    }
    public static final void defJavaThreadModel(){
        String definition ="Java uses threads to enable the entire environment \n" +
                "to be asynchronous. This helps reduce inefficiency by \n" +
                "preventing the waste of CPU cycles.\n";
        defEvenLoopWithPolling();
        System.out.println(definition);

        definition = "The benefit of Java’s java_complete_reference.multithreading is that the main loop/polling\n" +
                "mechanism is eliminated.One thread can pause without stopping other parts of\n" +
                "your program. For example, the idle time created when a thread reads data from\n" +
                "a network or waits for user input can be utilized elsewhere.Multithreading\n" +
                "allows animation loops to sleep for a second between each frame without\n" +
                "causing the whole system to pause. When a thread blocks in a Java program,\n" +
                "causing the whole system to pause.When a thread blocks in a Java program,\n" +
                "only the single thread that is blocked pauses. All other threads continue to run." +
                "\n Java multi tasking feature works in both systems Single core as well as double core\n" +
                "systems.In a single-core system, concurrently executing threads\n" +
                "share the CPU, with each thread receiving a slice of CPU time. Therefore, in a\n" +
                "single-core system, two or more threads do not actually run at the same time,\n" +
                "but idle CPU time is utilized. However, in multicore systems, it is possible for\n" +
                "two or more threads to actually execute simultaneously." +
                "";
        System.out.println(definition);
        defStatesOfThreads();
    }
    public static void defEvenLoopWithPolling(){
        String def = "Single-threaded systems use an approach called an event loop\n" +
                "with polling. In this model, a single thread of control runs in an infinite loop,\n" +
                "polling a single event queue to decide what to do next. Once this polling\n" +
                "mechanism returns with, say, a signal that a network file is ready to be read,\n" +
                "then the event loop dispatches control to the appropriate event handler. Until\n" +
                "this event handler returns, nothing else can happen in the program. This wastes\n" +
                "CPU time. It can also result in one part of a program dominating the system\n" +
                "and preventing any other events from being processed. In general, in a singlethreaded\n" +
                "environment, when a thread blocks (that is, suspends execution)\n" +
                "because it is waiting for some resource, the entire program stops running.";
        System.out.println(def);
    }
    public static void defStatesOfThreads(){
        String def = "Threads exist in several states. Here is a general description. A thread can be\n" +
                "running. It can be ready to run as soon as it gets CPU time. A running thread\n" +
                "can be suspended, which temporarily halts its activity. A suspended thread can\n" +
                "then be resumed, allowing it to pick up where it left off. A thread can be\n" +
                "blocked when waiting for a resource. At any time, a thread can be terminated,\n" +
                "which halts its execution immediately. Once terminated, a thread cannot be\n" +
                "resumed.";
        System.out.println(def);
    }

}
