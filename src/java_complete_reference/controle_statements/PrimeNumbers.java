package java_complete_reference.controle_statements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main (String ... arg){
        // this program will get init number and end number and provide prime numbers b/w those
        Scanner scanner = new Scanner(System.in);

        // ask for an other every time
        String confirm;
        do {
            System.out.print("This program will check provided number is prime or not\n" +
                    "Inter Number : ");
            int num = scanner .nextInt();

            boolean isPrime;
            if (num < 2 ) isPrime = false;
            else isPrime = true;

            for (int i = 2 ; i <= num/i; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(num +" is prime");
            else System.out.println(num+ " is not prime");

            System.out.print("Do you want check an other (y / n) ");
            confirm = scanner.next();
        }while (confirm.equals("y"));
    }
}
