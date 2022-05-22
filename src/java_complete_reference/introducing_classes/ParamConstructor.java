package java_complete_reference.introducing_classes;

public class ParamConstructor {
    int width, height, depth;

    public ParamConstructor(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double volume (){
        return width * depth * height;
    }
    // volume6
}
