package file_handlinng;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlingWrappers {
    /**
     * This will take file path as param and create file in provided folder path with provide file name
     * @param fileName File path of file
     * @param folderPath this is folder in which we want to create a file
     * @throws IOException Exception if occur
     */
    public static void createFile(String folderPath, String fileName) throws IOException {
        String filePath = folderPath+"\\"+fileName;
        File mFile = new File(filePath);
        //Todo Check file is available or not then perform tasks
        boolean isFileExists = mFile.exists();
        if (isFileExists) {
            System.out.println("File is already exists: "+ filePath);
            System.out.println("Do you want to read or write file.(R = read & W = write & N = no)");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your Response: ");
            String response = scanner.next();
            char[] charResponse = response.toCharArray();
            if (charResponse[0] == 'W'){
                System.out.print("Please provide text: ");
                String text = scanner.next();
                writeFile(filePath, text);
            }else if (charResponse[0] == 'R'){
                readFile(filePath);
            }else if (charResponse[0] == 'N'){
                System.out.println("Thanks for your response");
            }else {
                System.out.println("Please provide correct response");
            }
        }else {
            boolean isFileCreated = mFile.createNewFile();
            if (isFileCreated){
                System.out.println("File Created successfully.");
            }else {
                System.out.println("File Not created..");
            }
        }
    }

    /**
     * This will create a file with specified path
     * @param filePath file path of file
     * @throws IOException exception
     */
    public static void createFile(String filePath) throws IOException {
        File mFile = new File(filePath);
        //Todo Check file is available or not then perform tasks
        boolean isFileExists = mFile.exists();
        if (isFileExists) {
            System.out.println("File is already exists: "+ filePath);
            System.out.println("Do you want to read or write file.(R = read & W = write & N = no)");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your Response: ");
            String response = scanner.next();
            char[] charResponse = response.toCharArray();
            if (charResponse[0] == 'W'){
                System.out.print("Please provide text: ");
                String text = scanner.next();
                writeFile(filePath, text);
            }else if (charResponse[0] == 'R'){
                readFile(filePath);
            }else if (charResponse[0] == 'N'){
                System.out.println("Thanks for your response");
            }else {
                System.out.println("Please provide correct response");
            }
        }else {
            boolean isFileCreated = mFile.createNewFile();
            if (isFileCreated){
                System.out.println("File Created successfully.");
            }else {
                System.out.println("File Not created..");
            }
        }
    }

    /**
     * This will write file with provided text
     * @param filePath File path of file which you want to write
     * @param text text which we want to write in file
     */
    public static void writeFile(String filePath, String text){
        File mFile = new File(filePath);
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
                    writer.write(text);
                    writer.newLine();
                    writer.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            } else {
                System.out.println("File if not writeable: " + filePath);
            }
        }else {
            System.out.println("File is not exist: "+ filePath);
            System.out.println("Do you want to create file with provided path then write (Y = yes & N = no)");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your Response: ");
            String response = scanner.next();
            char[] charResponse = response.toCharArray();
            if (charResponse[0] == 'Y'){
                try {
                    createFile(filePath);
                    writeFile(filePath, text);
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

    /**
     * This will write file with number of lines of provided text
     * @param filePath file path of file which we want to write
     * @param text text which we want to write in file
     * @param numOfLines Text will be repeated this number of times
     */
    public static void writeFile(String filePath, String text, int numOfLines){
        File mFile = new File(filePath);
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
                    for (int i = 1; i <= numOfLines; i++){
                        writer.write(text);
                        writer.newLine();
                    }
                    writer.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            } else {
                System.out.println("File if not writeable: " + filePath);
            }
        }else {
            System.out.println("File is not exist: "+ filePath);
            System.out.println("Do you want to create file with provided path and then write(Y = yes & N = no)");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Your Response: ");
            String response = scanner.next();
            char[] charResponse = response.toCharArray();
            if (charResponse[0] == 'Y'){
                try {
                    createFile(filePath);
                    writeFile(filePath, text, numOfLines);
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

    /**
     * This will read whole file and lines return in list
     * @param filePath File path which we want to read
     * @return retunr list which can be used for other operations
     */
    public static ArrayList<String> readFile(String filePath) throws IOException {
        ArrayList<String>  list = new ArrayList<>();
        File file = new File(filePath);
        if (file.toString().endsWith(".pdf")){
            readPDF(file, list);
        }else if (file.toString().endsWith(".pptx")){
            readPPTX(file, list);
        }
        //Todo Check file is available or not then perform tasks
        boolean isFileExists = file.exists();
        if (isFileExists) {
            //Todo Check file is readable
            boolean ifFileReadAble = file.canRead();
            if (ifFileReadAble){
                //Todo read from file
                try{
                    FileReader mFilereader = new FileReader(file);
                    BufferedReader reader = new BufferedReader(mFilereader);
                    //Read all lines
                    String line = reader.readLine();
                    while (line != null){
                        list.add(line);
                        line = reader.readLine();
                    }
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else {
                System.out.println("File is not readable: "+filePath);
            }
        }else {
            System.out.println("File is not exist: " + filePath);
        }
        return list;
    }

    private static void readPPTX(File file, ArrayList<String> list) throws IOException {
        //Todo Check file is available or not then perform tasks
        boolean isFileExists = file.exists();
        if (isFileExists) {
            //Todo Check file is readable
            boolean ifFileReadAble = file.canRead();
            if (ifFileReadAble){
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+file);
            }else {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
            }
        }else {
            System.out.println("File is not exist: " + file);
        }
    }

    private static void readPDF(File file, ArrayList<String> list) throws IOException {
        //Todo Check file is available or not then perform tasks
        boolean isFileExists = file.exists();
        if (isFileExists) {
            //Todo Check file is readable
            boolean ifFileReadAble = file.canRead();
            if (ifFileReadAble){
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+file);
            }else {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file);
            }
        }else {
            System.out.println("File is not exist: " + file);
        }
    }

    /**
     * This will read number of lines specified.
     * @param filePath file path which we want to read
     * @param numOfLines number of lines which we want to read
     * @return return list of text on lines
     */
    public static String[] readFile(String filePath, int numOfLines){
        String[] mList = new String[numOfLines];
        File mFile = new File(filePath);
        //Todo Check file is available or not then perform tasks
        boolean isFileExists = mFile.exists();
        if (isFileExists) {
            //Todo Check file is readable
            boolean ifFileReadAble = mFile.canRead();
            if (ifFileReadAble){
                //Todo read from file
                try{
                    FileReader mFilereader = new FileReader(mFile);
                    BufferedReader reader = new BufferedReader(mFilereader);
                    for (int i = 0; i < numOfLines; i++){
                        mList[i] = reader.readLine();
                    }
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }else {
                System.out.println("File is not readable: "+filePath);
            }
        }else {
            System.out.println("File is not exist: " + filePath);
        }
        return mList;
    }

    public static String getPath() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Directory path: ");
        String dirPath = scanner.nextLine();
        System.out.print("File Name(eg: file name.extension): ");
        String fileName = scanner.nextLine();
        return dirPath+"\\"+fileName;
    }
}
