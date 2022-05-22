package java_complete_reference.controle_statements;

import java.util.Scanner;

import static java_complete_reference.controle_statements.Methods.intToDouble;

class MidPoint {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("This prog will return mid point of two numbers\n" +
                "Inter number1 : ");
        double sNum,eNum;
        sNum = scanner.nextFloat();
        System.out.print("Inter Number2 : ");
        eNum = scanner.nextFloat();
        //convert number to double for getting exact mid point
        eNum = intToDouble(eNum);
        sNum = intToDouble(sNum);
        if (sNum > eNum) {
            double i = sNum;
            sNum = eNum;
            eNum = i;
        }
        while (++sNum < --eNum);
        sNum = sNum % 2 == 1 ? sNum - 0.5 : sNum;
        System.out.println("Midpoint in "+sNum);
    }
}
