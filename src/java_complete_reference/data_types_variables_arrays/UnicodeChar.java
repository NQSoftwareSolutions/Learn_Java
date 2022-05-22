package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

class UnicodeChar {
    public static void main (String ... arg){
        /*
         * todo : purpose
         * Find char of specified unicode
         * this program demonstrate the use of char data type
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Find Character of Unicode \n" +
                "Inter Unicode : ");
        int uniChar = scanner.nextInt();
        System.out.println("Unicode is "+ MethodsDefinition.unicodeCharSet(uniChar));
    }
}
