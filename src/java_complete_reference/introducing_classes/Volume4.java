package java_complete_reference.introducing_classes;

public class Volume4 {
    public static void main (String ... arg){
        //create object one
        BoxConstructor box1 = new BoxConstructor();
        System.out.println("Box 1 volume is "+ box1.volume());//both objects have same copy

        //create object 2
        BoxConstructor box2 = new BoxConstructor();
        System.out.println("Box 2 volume is "+ box2.volume());
    }
}
