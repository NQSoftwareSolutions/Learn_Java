package interview;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime());
        isPrime2();
    }
    public static boolean isPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inter number : ");
        int num = scanner.nextInt();
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isPrime2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inter number : ");
        int num = scanner.nextInt();
        if (num == 2 | num % 2 != 0 | num % 3 != 0) {
            System.out.println(num + " is a prime number");
        } else System.out.println(num +" is not a prime number");
    }
}
