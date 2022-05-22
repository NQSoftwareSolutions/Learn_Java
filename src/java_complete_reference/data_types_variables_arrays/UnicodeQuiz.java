package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

class UnicodeQuiz {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Check your char and unicode is correct or not\n" +
                "Inter Character : ");
        String s = scanner.next();
        char character = MethodsDefinition.getChar(s);
        System.out.print("Inter Unicode : ");
        int uni = scanner.nextInt();

        boolean ans = MethodsDefinition.unicodeQuiz(character,uni);
        if (ans) { System.out.print("\nYou are right"); }
        else{ System.out.println("\nYou are wrong \n" +
                "correct answer is : "+ MethodsDefinition.charToUnicode(character));}
    }
}
