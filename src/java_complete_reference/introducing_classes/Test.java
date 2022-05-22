package java_complete_reference.introducing_classes;

public class Test {
    public static void main (String ... arg){
        //object of Box Class
        Box box;//declare reference to object
        box = new Box();// allocate a Box object


        //use data of Box Class
        double h1,w1,d1;
        w1 = box.width = 16;
        d1 = box.depth = 4;
        h1 = box.height = 12;
        System.out.print("Box1 Configuration\n" +
                "width is "+w1+"\n" +
                "Height is "+h1+"\n" +
                "Depth is "+d1);

        // second object of Box class
        Box box2 = new Box();
        //use data of Box Class
        double h2,w2,d2;
        w2 = box.width = 160;
        d2 = box.depth = 40;
        h2 = box.height = 120;
        System.out.print("\n\nBox2 Configuration\n" +
                "width is "+w2+"\n" +
                "Height is "+h2+"\n" +
                "Depth is "+d2);

        //Assign box box2 to box 1
        Box box3 = box2;// here we don't need new to create object
        System.out.println("\n\nBox 3 Configuration\n" +
                "width is "+(box3.width = w2 * 2)+"\n" +
                "height is "+(box3.height = h2 * 2)+"\n" +
                "Depth is "+(box3.depth = d2 * 2));

        System.out.println("\nbox three is "+box3);//box 3 & box 2 are same
        System.out.println("box 2 "+box2);
        System.out.println("box 1 "+box);// this box is different

        box3 = null; // this will unhook to it from box 2
        System.out.println("after null assigned to box 3");//
        System.out.println(box3);
        System.out.println(box2);
    }
}
