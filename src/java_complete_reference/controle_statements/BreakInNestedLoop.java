package java_complete_reference.controle_statements;

class BreakInNestedLoop {
    public static void main (String ... arg){
        int i,j,k;

        for (i = 5; i >= 1;i--){
            for (j = i; j >= 1; j--){
                System.out.println();
                for (k = j ; k <= 5; k++){
                    System.out.print("N");
                    if (k == 2) break;
                }
                /*
                As you can see, the break statement in the inner loop only causes termination
                of that loop. The outer loop is unaffected.
                 */
            }
        }

    }
}
