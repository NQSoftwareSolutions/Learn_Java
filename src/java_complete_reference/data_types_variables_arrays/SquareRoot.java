package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

class SquareRoot {
    public static void main (String ... arg){
        // demonstrate dynamic init to var
        System.out.print("Square Root\n" +
                "Inter number1 : ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        double square = Math.sqrt(num1);//dynamic init to var by other vars
        System.out.print("Square Root of "+num1+" is "+square);
    }
}
