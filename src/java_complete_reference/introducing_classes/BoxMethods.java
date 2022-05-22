package java_complete_reference.introducing_classes;

class BoxMethods {
    double width;
    double height;
    double depth;

    //create a method which initialize box parameters
    public  void  setDimension (double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //create a method which return volume
    public double volume(){
        return width * depth * height;
    }
}
// create a test main class volume3

