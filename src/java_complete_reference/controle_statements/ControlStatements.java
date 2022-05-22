package java_complete_reference.controle_statements;
class ControlStatements {
    public static void main (String ... arg){
        // this program is for demo of all control statements
        int i = 0;

        // selection else statement
        if (i == 0) System.out.println("i is "+i);
        else System.out.println("i is "+i);

        // iteration statements
        for (i= 0; i < 10 ; i++) System.out.println("\t\ti : "+i);

        // jump statement
        for (i= 0; i < 10 ; i++){
            if (i == 5) break;
            System.out.println("\t\ti : "+i);
        }

    }
}
