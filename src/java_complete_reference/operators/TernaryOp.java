package java_complete_reference.operators;

import java.util.Scanner;

class TernaryOp {
    public static void main (String ... arg){
        // create a method which print 1st name or 2nd name
        Scanner scanner = new Scanner(System.in);
        System.out.print("This will provide any of name 1st or second \n" +
                "so you can enter one value as null (any of )\n" +
                "Inter first Name : ");
        String fName = scanner.next();
        System.out.print("Inter second name : ");
        String sName = scanner.next();

        System.out.println("Name is "+ name(fName,sName));
    }
    public static String name (String firstName,String secondName){
        String name = firstName .equals("null") ? secondName : firstName;// use of ternary operator
        // if first name is null then second name
        return name;
    }
}
