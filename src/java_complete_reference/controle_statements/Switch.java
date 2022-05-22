package java_complete_reference.controle_statements;
import java.util.Scanner;

class Switch {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program is just demonstrating switch as whole\n" +
                "Inter number  : ");
        int num = scanner. nextInt();

        switch (num){
            case 1:
                System.out.println("Number is one");
                break;
            case 2:
                System.out.println("Number is two");
                break;
            case 3:
                System.out.println("Number is three");
                break;
            case 4:
                System.out.println("Number is four");
                break;
            case 5:
                System.out.println("Number is five");
                break;
            default:
                System.out.println("Number is not 0 to 5");
        }
    }
}
