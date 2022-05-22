package file_handlinng.fms;

import file_handlinng.FileHandlingWrappers;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FMS {
    public static void main(String[] args) throws IOException {
         fileManagementSystem();
    }

    private static void fileManagementSystem() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Well come To File Management system.");
        System.out.println("Please choose any option." +
                "(C = create, R = Read, W = Write, D = Delete, MV = Move, CP = Copy)");
        System.out.print("Please enter your response: ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("C")){
            String filePath = FileHandlingWrappers.getPath();
            FileHandlingWrappers.createFile(filePath);
            reuseFMS();
        }else if (response.equalsIgnoreCase("R")){
            String filePath = FileHandlingWrappers.getPath();
            List<String> mList = FileHandlingWrappers.readFile(filePath);
            for (String s:mList) {
                System.out.println(s);
            }
            reuseFMS();
        }else if (response.equalsIgnoreCase("W")){
            String filePath = FileHandlingWrappers.getPath();
            System.out.print("Enter Text: ");
            String text = scanner.next();
            FileHandlingWrappers.writeFile(filePath, text);
            reuseFMS();
        }else if (response.equalsIgnoreCase("D")){
            System.out.println("Method not available");
        }else if (response.equalsIgnoreCase("MV")){
            System.out.println("Method not available");
        }else if (response.equalsIgnoreCase("CP")){
            System.out.println("Method not available");
        }else {
            System.out.println("Response was not correct.");
            fileManagementSystem();
        }
    }

    private static void reuseFMS() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to make any other operation (Y = yes, N = no)");
        System.out.print("Enter Response: ");
        String response = scanner.next();
        if (response.equalsIgnoreCase("Y")){
           fileManagementSystem();
        }else if (response.equalsIgnoreCase("N")){
            System.out.println("Thanks for using FMS.");
        }else {
            System.out.println("Response was not correct.");
            reuseFMS();
        }
    }
}
