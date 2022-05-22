package java_complete_reference.introducing_classes;

class BoxConstructor {
    double width;
    double height;
    double depth;

    //Constructor of box class
    BoxConstructor() {
        System.out.println("Constructing Box");
        width = 10;
        height = 25;
        depth = 15;
    }

    public double volume (){
        return width * height * depth;
    }
    //create a class volume4
}
