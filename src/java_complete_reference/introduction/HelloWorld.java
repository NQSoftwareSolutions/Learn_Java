/**
 * java_complete_reference.introduction is user defined package
 * These packages defined by systems when we work in folder hierarchy
 */
package java_complete_reference.introduction;
/**
 * java.util.Scanner
 *  is built in java library or package use for command line input & output.
 *  Build in packages have extra already defined methods which we have to just use.
 *  For using build in packages we have to import the by "Import Key word"
 */
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");
    }
}
