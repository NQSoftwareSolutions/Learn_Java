package java_complete_reference.controle_statements;

class BreakInfiniteLoop {
    public static void main (String ... arg){
        for (;;){
            break;
        }
        System.out.println("loop complete");
    }

}
