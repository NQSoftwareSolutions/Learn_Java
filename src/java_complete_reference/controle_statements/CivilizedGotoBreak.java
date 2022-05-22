package java_complete_reference.controle_statements;

class CivilizedGotoBreak {
    public static void main (String ... arg){

        goto1:{
            goto2:{
                goto3:{
                    System.out.println("before break called we are in goto3");
                    if (true) break goto2;
                    System.out.println("after break called we are in goto3");
                }
                System.out.println("After break called we are in goto2");
            }
            System.out.println("After break called we are in goto1");
        }


    }
}
