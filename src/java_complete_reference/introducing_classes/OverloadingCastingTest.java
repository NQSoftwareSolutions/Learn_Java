package java_complete_reference.introducing_classes;

public class OverloadingCastingTest {
    public static void main (String ... arg){
        // create an object of OverloadingCasting class
        OverloadingCasting oc = new OverloadingCasting();

        int i = 210;

        oc .m(i);

        oc .m(i,12);
    }
}
