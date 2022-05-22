package java_complete_reference.network_security.caeser_cipher;

import java.util.Scanner;

public class CaeserCipher2 {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Encryption");
        System.out.print("Enter Text : ");
        String text = scanner.nextLine();
        System.out.print("Key (Eg 3): ");
        int key = scanner.nextInt();
        System.out.println("Cipher : " + encrypt(text,key));
        System.out.println("Decryption");
        System.out.println("Text : " + decrypt(encrypt(text,key),key));
    }

    private static String encrypt(String text, int key) {
        StringBuffer result= new StringBuffer();
        char[] chars = text.toCharArray();
        for (int i=0; i<chars.length; i++){
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                char code = (char)(chars[i] + key);
                if (code > 'Z'){
                    code = (char)(code - 26);
                    result.append(code);
                }else {
                    code = (char)(chars[i] + key);
                    result.append(code);
                }
            }else if (chars[i] >= 'a' && chars[i] <= 'z'){
                char code = (char)(chars[i] + key);
                if (code > 'z'){
                    code = (char)(code - 26);
                    result.append(code);
                }else {
                    code = (char)(chars[i] + key);
                    result.append(code);
                }
            }else {
                char code = (char)(chars[i] + key);
                result.append(code);
            }
        }
        return result.toString();
    }
    private static String decrypt(String cipher, int key) {
        StringBuffer result= new StringBuffer();
        char[] chars = cipher.toCharArray();
        for (int i=0; i<chars.length; i++){
            if (chars[i] >= 'A' && chars[i] <= 'Z'){
                char code = (char)(chars[i] - key);
                if (code < 'A'){
                    code = (char)(code + 26);
                    result.append(code);
                } else {
                    code = (char)(chars[i] - key);
                    result.append(code);
                }
            }else if (chars[i] >= 'a' && chars[i] <= 'z'){
                char code = (char)(chars[i] - key);
                if (code < 'a'){
                    code = (char)(code + 26);
                    result.append(code);
                }else {
                    code = (char)(chars[i] - key);
                    result.append(code);
                }
            }else {
                char code = (char)(chars[i] - key);
                result.append(code);
            }
        }
        return result.toString();
    }

}
