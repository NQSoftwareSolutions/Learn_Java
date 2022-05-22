package java_complete_reference.network_security.caeser_cipher;

import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encryption");
        System.out.print("Enter your text: ");
        String text = scanner.nextLine();
        System.out.print("Shifting key (eg 4): ");
        int s = scanner.nextInt();
        System.out.println("Cipher: " + encrypt(text, s));
        System.out.println("Decryption");
        s = s -(s * 2);
        StringBuffer result = decrypt(encrypt(text,s).toString(),s);
        System.out.println("Text : "+result);
    }

    /**
     * @param text Plain text
     * @param s key which we want to use for encryption
     * @return Cipher text
     */
    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result= new StringBuffer();
        for (int i=0; i<text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
            }
            else {
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    /**
     * @param cipher Cipher text
     * @param s key which we want to use for encryption
     * @return Cipher text
     */
    public static StringBuffer decrypt(String cipher, int s) {
        StringBuffer result= new StringBuffer();
        for (int i=0; i<cipher.length(); i++) {
            if (Character.isUpperCase(cipher.charAt(i))) {
                char ch = (char)((((int)cipher.charAt(i) - s - 65) % 26 + 65));
                result.append(ch);
            }
            else {
                char ch = (char)((((int)cipher.charAt(i) - s - 97) % 26 + 97));
                result.append(ch);
            }
        }
        return result ;
    }
}
