package java_complete_reference.introducing_classes;

public class OverloadingConstTest {
    public static void main (String ... arg){
        // create object of OverloadingConst class
        OverloadingConst oc = new OverloadingConst();
        OverloadingConst cube = new OverloadingConst(12);
        OverloadingConst box = new OverloadingConst(12,34,45);

        // invoke volume method with vol
        double vol;

        // 1st box volume
        vol = oc.volume();
        System.out.println("First box volume : "+vol);
        // 2nd box volume
        vol = cube.volume();
        System.out.println("Second box Volume : "+vol);
        // 3rd box volume
        vol = box.volume();
        System.out.println("3rd box volume : "+vol);
    }
}
