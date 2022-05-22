package interview;

import java_complete_reference.multithreaded_programming.CreateThread;

import java.util.Scanner;

public class ReverseString2 {
    public static void main(String args[]) {
        System.out.println(reverseString("Abdul Qayoom"));
    }
    public static String reverseString(String string){
        StringBuilder reverse = new StringBuilder();
        for(int i=string.length(); i > 0; --i){
            reverse.append(string.charAt(i - 1));
        }
        return String.valueOf(reverse);
    }
}
