package java_complete_reference.controle_statements;

public class NestedSwitch {
    public static void main (String ... arg){
        int i , j;
        i = j = 1;

        // both switches have own block so we can provide same case numbers for both
        switch (i){
            case 1:
                System.out.println("i si "+ i);
                switch (j){
                    case 1 :
                        System.out.println("j is "+j);
                        break;
                }
                break;
        }

    }
}
