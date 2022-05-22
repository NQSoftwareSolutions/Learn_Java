package java_complete_reference.introducing_classes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FactorialsTest {
    public static void main (String ... arg){
        Factorials f = new Factorials();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find Factorials \n" +
                "Inter Num : ");
        int num = scanner.nextInt();

        System.out.print("Factorial of "+num+" is : "+f.fact(num));

    }

}
