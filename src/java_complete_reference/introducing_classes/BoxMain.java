package java_complete_reference.introducing_classes;

public class BoxMain {
    public static void main (String ... arg){
        // object of box class

        Box box = new Box();

        // assign values to box data
        box.width = 100;
        box.height = 200;
        box.depth = 100;

        // compute volume of box
        var vol = box.width * box.depth * box.height;

        // print volume
        System.out.print("Volume of box is "+ vol);
    }
}
