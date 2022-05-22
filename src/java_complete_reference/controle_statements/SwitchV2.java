package java_complete_reference.controle_statements;

import java.util.Scanner;

class SwitchV2 {
    public static void main (String ... arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program is just demonstrating switch for evoluting multiple case\n" +
                "Inter number  : ");
        int num = scanner.nextInt();

        switch (num) {
            case 1, 2, 3 -> System.out.println("Number is 3 or less then 3");
            case 4, 5 -> System.out.println("Number is five or less then 5");
            default -> System.out.println("Number is greater then 5");
        }
    }
}
