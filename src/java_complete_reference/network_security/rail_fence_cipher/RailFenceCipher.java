package java_complete_reference.network_security.rail_fence_cipher;

import java.util.ArrayList;
import java.util.Scanner;

public class RailFenceCipher {
    public static void main (String ... arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Encryption");
        System.out.print("Enter Text : ");
        String text = input.nextLine();
        System.out.print("Enter Key (eg: 3): ");
        int encryptionKey = input.nextInt();

        encryptRailFence(text,encryptionKey);
        System.out.println("Decryption");
        System.out.print("Enter Cypher: ");
        String cipher = input.nextLine();
        System.out.println("Enter key(eg: 3): ");
        int decryptionKey = input.nextInt();
        decryptRailFence(cipher,decryptionKey);
    }
    private static String encryptRailFence(String text, int key) {
        //todo Create a matrix for cipher plaintext
        //key = rows & length of text = column's
        char[][] railMatrix = new char[key][(text.length())];
        //Todo fill the matrix to distinguish filled spaces from blank once
        for (int i = 0; i < key; i++)
            for (int j = 0; j < text.length(); j++)
                railMatrix[i][j] = '\n';
            //Todo find the direction
        boolean directionDown = false;
        int row = 0, column = 0;
        for (int i = 0; i < text.length(); i++){
            /**
             * todo check the direction flow
             * reverse the direction if we have just filled the top or bottom rail
             */
            if (row == 0 || row == key-1)
                directionDown = !directionDown;
            //todo fill the alphabet

            railMatrix[row][column++] = text.toCharArray()[i];
            //todo find next row using direction variable
            if (directionDown){
                row++;
            }else {
                row--;
            }
        }
        //todo construct cipher using matrix
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < key; i++)
            for (int j = 0; j < text.length(); j++)
                if (railMatrix[i][j] != '\n')
                    result.add(railMatrix[i][j]);
                return result.toString();
    }

    private static void decryptRailFence(String cipher, int decryptionKey) {

    }
}
