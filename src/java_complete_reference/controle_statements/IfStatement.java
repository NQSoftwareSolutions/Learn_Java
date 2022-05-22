package java_complete_reference.controle_statements;

import java.util.Scanner;

class IfStatement {
    public  static void main(String ... arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("THis program is just for demonstration of if control statements \n" +
                "So just provide some int values \n" +
                "Inter value A : ");
        int a = scanner.nextInt();
        System.out.print("Inter value B : ");
        int b = scanner.nextInt();
        System.out.print("Inter value C : ");
        int c = scanner.nextInt();
        boolean equalA = (a == b);
        boolean equalC = (c == b);

        if (a < b){
            System.out.println("A is less then b");
        }else if (a < c){
            System.out.println("A is less then c");
        }else if (a > c){
            System.out.println("A is greater then c");
        }else if (a > b ){
            System.out.println("A is greater then b");
        }else if (equalA) {
            System.out.println("A is equal to b");
        }else if (equalC){
            System.out.println("C is equals to B");
        }else System.out.println("B is : "+b);
    }
}
