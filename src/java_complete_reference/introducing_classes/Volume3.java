package java_complete_reference.introducing_classes;

public class Volume3 {
    public static void main (String ... arg){
        BoxMethods boxMethods = new BoxMethods();

        // init dimensions
        boxMethods.setDimension(12,8,4);

        //find volume of box
        boxMethods.volume();

        // print dimensions
        System.out.println("Width is "+ boxMethods.width+"\n" +
                "Height is "+ boxMethods.height+"\n" +
                "depth is "+ boxMethods.depth);

        //Print volume of box
        System.out.println("Volume of box is "+ boxMethods.volume());

        // now change arguments of volume method and print other boxes volume
        boxMethods.setDimension(24,16,8);
        System.out.println("volume of box 2 is "+ boxMethods.volume());
    }
}
