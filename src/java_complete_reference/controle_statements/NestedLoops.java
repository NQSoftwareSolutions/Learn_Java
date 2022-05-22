package java_complete_reference.controle_statements;

class NestedLoops {
    public static void  main (String ... arg){
        int i,j,k;
        for (i = 0; i < 10; i++){
            for (j = i; j < 10; j++){
                System.out.print("N");
                for (k = j; k < 10;k++ )
                    System.out.print("Q");
            }
            System.out.println();
        }
        int l,m,n;
        for (l = 10; l > 0; l--){
            for (m = l; m < 10; m++){
                System.out.print("N");
                for (n = m; n < 10;n++ )
                    System.out.print("Q");
            }
            System.out.println();
        }
    }
}
