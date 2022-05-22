package java_complete_reference.controle_statements;

import java.util.Scanner;

class SwitchV3 {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program is just demonstrating the java_complete_reference.string evolution by switch\n" +
                "Inter number in english from 0 to 3 like (one two three)\n" +
                "Inter Number : ");
        String sNum = scanner .next();
        switch (sNum){
            case "one" -> System.out.println("Number is One");
            case "two" -> System.out.println("Number is Two");
            case "three" -> System.out.println("Number is Three");
            default -> System.out.println("No match");
        }

    }
}
