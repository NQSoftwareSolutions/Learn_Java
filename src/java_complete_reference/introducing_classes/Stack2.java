package java_complete_reference.introducing_classes;

public class Stack2 {
    /*
    Create both instance vars as private so then can not tempered outside
     */
    private int[] stck = new int[10];
    private int tos;

    // init the top of stack
    Stack2 (){
        tos = -1;//always will be top of stack
    }

    // push an item on the stack
    void push(int item){
        if (tos == 9)// last element of stack 0 to 9
            System.out.println("Stack is full");
        else stck[++tos]  = item;// increase thw top value by 1 and set element on that index
    }

    //Pop an item from the stack
    int pop(){
        if (tos < 0){//if stack is empty
            System.out.println("Stack under flow");
            return 0;
        }else return stck[tos--];//return element from top..
    }
}
