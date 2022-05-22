package java_complete_reference.controle_statements;

public class NestedIf {
    public static void main (String ... arg){
        int i = 5;
        if (i < 5){
            System.out.println("i is less then 5");
            if (i < 3){
                System.out.println("i is less then 3");
            }
            else {
                System.out.println("i is not less then 3");
            }
        }
        else {
            System.out.println("I is not less then 5");
        }
    }
}
