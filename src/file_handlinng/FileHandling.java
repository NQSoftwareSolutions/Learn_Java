package file_handlinng;

import java.io.*;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //Todo represent a file
        final String FILE_PATH = "D:\\Downloads\\Documents\\MyWorkOnTechs\\Notepad\\File_handling_demo_file2.txt";
        // path will be (Ride share screens.txt) if file is available in project directory.
        File mFile = new File(FILE_PATH);

        //Todo Check file is available or not then perform tasks
        boolean isFileExists = mFile.exists();
        if (isFileExists) {
            //Todo Check file is writeable or not
            boolean isFileWriteAble = mFile.canWrite();
            if (isFileWriteAble) {
                //Todo Write to files
                try {
                    FileWriter mFileWriter = new FileWriter(mFile);
                    BufferedWriter writer = new BufferedWriter(mFileWriter);
                    // write 10 lines in file so (Append)
                    for (int i = 1; i <= 10; i++){
                        writer.write("This is line # "+ i);
                        writer.newLine();
                    }
                    writer.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            } else {
                System.out.println("File if not writeable: " + FILE_PATH);
            }

            //Todo Check file is readable
            boolean ifFileReadAble = mFile.canRead();
            if (ifFileReadAble){
                //Todo read from file
                try{
                    FileReader mFilereader = new FileReader(mFile);
                    BufferedReader reader = new BufferedReader(mFilereader);
                    //Read all lines
                    String line = reader.readLine();
                    while (line != null){
                        System.out.println(line);
                        line = reader.readLine();
                    }
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else {
                System.out.println("File is not readable: "+FILE_PATH);
            }
        }else {
            System.out.println("File is not exist: "+FILE_PATH);
            System.out.println("Do you want to create file with provided path (Y = yes & N = no)");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your Response: ");
            String response = scanner.next();
            char[] charResponse = response.toCharArray();
            if (charResponse[0] == 'Y'){
                //Todo Create a file
                try {
                    boolean isFileCreated = mFile.createNewFile();
                    if (isFileCreated){
                        System.out.println("File Created successfully.");
                    }else {
                        System.out.println("File Not created..");
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else if (charResponse[0] == 'N'){
                System.out.println("Thanks for your response.");
            }else {
                System.out.println("Please provide correct response");
            }
        }
    }
}