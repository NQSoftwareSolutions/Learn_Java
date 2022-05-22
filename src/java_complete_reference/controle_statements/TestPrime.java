package java_complete_reference.controle_statements;

import java.util.Scanner;

import static java_complete_reference.controle_statements.Methods.*;

class TestPrime {
    public static void main (String ... arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will tell you that your provided Integer literal is prime or not.");
        int literal;
        do {
            System.out.print("Inter Integer Literal : ");
            literal = scanner.nextInt();

        } while (literal <= 0);
        boolean isPrime = testPrime(literal);
        if (isPrime) System.out.println(literal+ " is prime");
        else System.out.println(literal + " is not prime");
    }
}
