package file_handlinng;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandlingV2 extends FileHandlingWrappers{
    public static void main(String[] args) throws IOException {
        //Create a file with name
        final String folderPath = "D:\\Downloads\\Documents\\MyWorkOnTechs\\Notepad";
        final String fileName = "File_handling_demo_file.txt";
//        fileHandling.createFile(folderPath, fileName);
        //Read file
        String filePath = folderPath+"\\"+fileName;
        String[] mList =  FileHandlingWrappers.readFile(filePath, 5);
        for (String s:mList) {
            System.out.println(s);
        }
        ArrayList mList2 =  FileHandlingWrappers.readFile(filePath);
        for (Object s:mList2) {
            System.out.println(s);
        }
    }
}
