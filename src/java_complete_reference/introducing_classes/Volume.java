package java_complete_reference.introducing_classes;

import java.util.Scanner;

public class Volume {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        Box  box ;//declaring reference to an object  but not actual object
        box = new Box();//Allocating a Box object and reference to actual object of class Box memory address
        // get the volume of box
        System.out.print("Volume of Box\n" +
                "Inter width : ");
        double w = scanner.nextDouble();
        System.out.print("Inter height : ");
        double h = scanner .nextDouble();
        System.out.print("Inter Depth : ");
        double d = scanner.nextDouble();

        // assign input values to box class data
        double height, width, depth;
        height = box.height = h;
        width = box.width = w;
        depth = box .depth = d;

        // calculate volume
        double volume = height * width * depth;

        System.out.println("Volume of Box is "+volume);

    }
}
