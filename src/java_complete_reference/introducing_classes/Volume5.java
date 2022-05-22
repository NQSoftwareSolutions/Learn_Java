package java_complete_reference.introducing_classes;

public class Volume5 {
    public static void main (String ... arg){
        //create object of box demo class
        BoxMethods2 box = new BoxMethods2(12,34,2);
        System.out.println("Volume of Box 1 is "+box.volume());

        //create 2nd object of box demo class
        BoxMethods2 box2 = new BoxMethods2(123,334,1);
        System.out.println("Volume of Box 2 is "+box2.volume());
    }
}
