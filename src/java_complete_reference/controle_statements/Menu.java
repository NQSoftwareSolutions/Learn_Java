package java_complete_reference.controle_statements;

import java.util.Scanner;

class Menu {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        byte choice ;
        do {
            System.out.print("Help on : \n" +
                    "1. if\n" +
                    "2. switch\n" +
                    "3. while\n" +
                    "4. do-while\n" +
                    "5. for \n" +
                    "Choose one : ");
            //choice = (char) System.in.read();//java console input method
            choice = scanner.nextByte();
        }while (choice < 1 || choice > 5);

        System.out.println("\n");
        switch (choice){
            case 1 -> System.out.print("The if : \n\n" +
                    "if (condition) {\n" +
                    "\t\t body \n" +
                    "}\n" +
                    "else{\n" +
                    "\t\t body \n" +
                    "}");
            case 2 -> System.out.print("The Switch :\n\n" +
                    "switch(expression) {\n" +
                    " case value : \n" +
                    "\t\t case body;\n" +
                    "\t\t break;\n" +
                    "case N:\n" +
                    "\t\t body\n" +
                    "\t\t break;\n" +
                    "default:\"" +
                    "\t\t body\n" +
                    "}");
            case 3 -> System.out.print("The while :\n\n" +
                    "while(expression){\n" +
                    "\t\t body\n" +
                    "}");
            case 4 -> System.out.print("The do-while : \n\n" +
                    "do {\n" +
                    "\t\t do bofy\n" +
                    "}\n" +
                    "while(expression)");
            case 5 -> System.out.print("The for:\n\n" +
                    "for(expression){\n" +
                    "\t\t body\n" +
                    "}");
        }
    }
}
