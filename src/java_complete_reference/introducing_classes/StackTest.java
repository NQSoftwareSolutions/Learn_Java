package java_complete_reference.introducing_classes;

public class StackTest {
    public static void main (String ... arg){
        // create two objects of stack class
        Stack stack = new Stack();
        Stack stack1 = new Stack();

        // push some numbers on to the stack
        for (int i = 0 ; i < 10 ; i++) stack.push(i);
        for (int i = 10; i < 20; i++) stack1.push(i);

        //POP those items from the stack
        System.out.println("Stack in stack obj 1");
        for (int i = 0; i < 10; i++)
            System.out.println(stack.pop());

        System.out.println("Stack in stack obj 2");
        for (int i = 0; i < 10; i++)
            System.out.println(stack1.pop());
    }
}
