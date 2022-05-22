package java_complete_reference.controle_statements;

import java.util.Scanner;
import static java_complete_reference.controle_statements.Methods.*;

class Search {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search any number number\n" +
                "Inter any number : ");
        int num = scanner.nextInt();

        // create a un sorted array
        int[] numbers = createArray(1,100_000_000);
        boolean found = false;

        for (int x : numbers){
            if (x == num){
                System.out.println("Value found\nIt is "+x);
                found = true;
                break;
            }
        }
        if (!found)System.out.println("Not in dictionary");
    }
}
