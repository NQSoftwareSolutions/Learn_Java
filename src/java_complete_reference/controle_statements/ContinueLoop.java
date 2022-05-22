package java_complete_reference.controle_statements;

class ContinueLoop {
    public static void main (String ... arg){
        int i;
        for (i = 0; i < 10; i++){
            System.out.print(i+"\t\t");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}
