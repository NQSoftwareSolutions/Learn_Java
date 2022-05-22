package java_complete_reference.controle_statements;

class Return {
    public static void main(String ... arg){
        boolean t = true;

        System.out.println("Before the return");
        if (t) return;//this statement is very important to run this program else compiler will give "unreachable statement" error
        System.out.println("After the Return");//will not execute
    }
    /*
    final println( ) statement is not executed. As soon as
return is executed, control passes back to the caller.
     */
    /*
    In this program, the if(t) statement is necessary.
Without it, the Java compiler would flag an “unreachable code” error because
the compiler would know that the last println( ) statement would never be
executed. To prevent this error, the if statement is used here to trick the
compiler for the sake of this demonstration.
     */

}
