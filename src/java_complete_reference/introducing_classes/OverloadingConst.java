package java_complete_reference.introducing_classes;

public class OverloadingConst {
    double height,width ,depth;
    // create a default const for just init all instance vars// with out dimensions
    OverloadingConst(){
        this.width = -1;
        this.depth = -1;
        this.height = -1;
    }

    // this const will create cube object
    OverloadingConst(double len){
        depth = height = width = len;
    }
    // this will create box
    OverloadingConst(double h, double w, double d){
        width = w;
        height = h;
        depth = d;
    }
    //create a method to calculate volume
    public  double volume (){
        return   height * width * depth;
    }
    // create class OverloadingConstTest
}
