package java_complete_reference.introducing_classes;

public class ObjectAsConstParam {
    double width,height,depth;

    ObjectAsConstParam(ObjectAsConstParam ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    ObjectAsConstParam (double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    public  double volume (){
        return width * depth * height;
    }
    // create class ObjectAsConstParamTest
}
