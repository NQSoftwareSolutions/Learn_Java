package java_complete_reference.introducing_classes;

public class ObjectAsConstParamTest {
    public static void main (String ... arg){
        // create objects of ObjectAsConstParam class
        ObjectAsConstParam box1 = new ObjectAsConstParam(23,23,45);

        ObjectAsConstParam box2 = new ObjectAsConstParam(box1);// create copy of box 1

        System.out.println("Volume of box 1 is : "+box1.volume());// both should same b/c box2 is copy of box1
        System.out.println("Volume of box 2 is : "+box2.volume());
    }
}
