package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

public class CharToUnicode {
    public static void main (String ... arg){
        /*
          todo : Purpose
         This program will get a character and provide us char unicode
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Get unicode of character \n" +
                "Inter Character : ");
        String s = scanner.next();//get java_complete_reference.string input
        char ch = MethodsDefinition.getChar(s);
        System.out.println("Unicode of "+ch+" is "+ MethodsDefinition.charToUnicode(ch));
    }
}
