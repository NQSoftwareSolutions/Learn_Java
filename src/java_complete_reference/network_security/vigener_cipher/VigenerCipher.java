package java_complete_reference.network_security.vigener_cipher;

import java.util.Scanner;

public class VigenerCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encryption");
        System.out.print("Enter message: ");
        String message = scanner.nextLine();
        System.out.print("Enter Key(eg AGE) : ");
        String key = scanner.next();
        String encryptedMsg = encrypt(message, key);
        System.out.println("Cipher: " + encryptedMsg);
        System.out.println("Decryption");
        System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));
    }
   public static String encrypt(String text, final String key) {
            String result = "";
            text = text.toUpperCase();
            for (int i = 0, j = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c < 'A' || c > 'Z') {
                    continue;
                }
                result += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
                j = ++j % key.length();
            }
            return result;
        }

        public static String decrypt(String text, final String key) {
            String result = "";
            text = text.toUpperCase();
            for (int i = 0, j = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c < 'A' || c > 'Z') {
                    continue;
                }
                result += (char) ((c - key.charAt(j) + 26) % 26 + 'A');
                j = ++j % key.length();
            }
            return result;
        }
}
