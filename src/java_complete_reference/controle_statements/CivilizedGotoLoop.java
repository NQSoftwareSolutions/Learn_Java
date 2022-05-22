package java_complete_reference.controle_statements;

class CivilizedGotoLoop {
    public static void main (String ... arg){
        int i,j;
        outerLoop:for(i = 0; i < 10; i++){
            System.out.print("pass "+i+" : ");
            for (j = 1; j < 100 ; j++){
                if (j==10) break outerLoop;
                System.out.print(j+"\t\t");
            }
            System.out.println("loop outside");
        }
        System.out.println("loops complete");

        /*
    when the inner loop breaks to the outer loop, both loops have
been terminated.
     */
    /*
    Keep in mind that you cannot break to any label which is not defined for an
enclosing block.
     */
        one : for (i = 0 ; i < 5 ; i++){
            System.out.print("i\t\t");
        }
        for (j = 0 ; j < 10; j++){
            // try to break upper loop but not possible it will give error
            if (j == 5) ;//break one;
        }
    }
}
