package java_complete_reference.introducing_classes;

public class Volume7 {
    public static void main (String ... arg){
        UseThis useThis = new UseThis(23,56,67);
       var vol = useThis.volumeBox();
        System.out.println("volume of box "+vol);
    }
    /*
    This version of Box( ) operates exactly like the earlier version. The use of this
is redundant, but perfectly correct. Inside Box( ), this will always refer to the
invoking object.
     */
}
