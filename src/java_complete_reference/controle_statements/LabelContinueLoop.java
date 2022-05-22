package java_complete_reference.controle_statements;

class LabelContinueLoop {
    public static void main (String ... arg){
        outerLoop:for (int i = 0 ; i < 10 ; i++){
                    for (int j = 0 ; j < 10 ; j++){
                        if (j > i){
                            System.out.println();
                            continue outerLoop;
                        }
                        System.out.print(" "+ (i * j));
                    }
        }
        System.out.println();
    }
}
