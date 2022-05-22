package java_complete_reference.controle_statements;

import static java_complete_reference.controle_statements.Methods.createArray;

class BreakLoop {
    public static void main (String ... arg){
        int[] array = createArray(1,10);
        for (int x : array) {
            System.out.print("\t\t"+x);
            if (x == 5) break;
            /*
            As you can see, although the for loop is designed to run from 1 to 10, but the break
                statement causes it to terminate early, when x equals 5.
             */
        }
        System.out.print("\nLoop completed");
    }
}
