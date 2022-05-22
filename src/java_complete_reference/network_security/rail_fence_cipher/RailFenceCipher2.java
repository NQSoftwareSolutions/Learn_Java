package java_complete_reference.network_security.rail_fence_cipher;

import java.util.Scanner;

public class RailFenceCipher2 {
    public static void main(String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encryption");
        System.out.print("Enter Message: ");
        String text = scanner.nextLine();
        System.out.print("Enter Key(eg 3): ");
        int key = scanner.nextInt();
        System.out.println("Cipher: " + encrypt(text,key));
        System.out.println("Decryption");
        System.out.println("Text: " +decrypt(encrypt(text,key),key));
    }
    private static String encrypt(String text, int key) {
        StringBuffer result = new StringBuffer();
        char[] charTable = {};
        for (int i = 0; i < key; ++i){
        }
        return  result.toString();
    }
    private static String decrypt(String cipher, int key) {
        StringBuffer result = new StringBuffer();

        return  result.toString();
    }
}
