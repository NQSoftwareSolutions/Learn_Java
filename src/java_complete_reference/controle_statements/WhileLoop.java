package java_complete_reference.controle_statements;

import java.util.Scanner;

class WhileLoop {
    public static void main (String ... arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inter times : ");
        int t = scanner.nextInt();
        int i = 0;
        while (i <= t) {
            System.out.print("\tplease.\t\t\n");
            i++;
        }
        // this statement will not execute
        int a = 4, b = 10;
        while (a > b)
            System.out.println(a + "\t\t");

        // loop with empty body and find mid point
        while (++a < --b) ;
        System.out.println("mid point of a & b is "+a);


    }
}
