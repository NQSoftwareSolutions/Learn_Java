package java_complete_reference.introducing_classes;

class BoxMethods2 {
    double width;
    double height;
    double depth;

    public BoxMethods2(double width, double height, double depth) {
        //we will discuss this in further lectures in detail
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double volume (){
        return  width * depth * height;
    }
}
