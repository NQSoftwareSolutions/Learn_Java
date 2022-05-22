package java_complete_reference.programs;

import java.util.*;

import static java_complete_reference.programs.Methods.*;

public class CountWords {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program will count words in your provided java_complete_reference.string.\n" +
                "Paste your whole java_complete_reference.string : ");
        String str = scanner.next();
        System.out.print("\t\tworlds in your java_complete_reference.string is "+countWords(str));
    }
}
