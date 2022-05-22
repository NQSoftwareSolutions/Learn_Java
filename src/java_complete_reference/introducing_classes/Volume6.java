package java_complete_reference.introducing_classes;

public class Volume6 {
    public static void main (String ... arg){
        ParamConstructor paramConstructor = new ParamConstructor(23,23,34);

        // call method which will use constructor params
        var vol = paramConstructor.volume();
        System.out.println("Box Volume is "+ vol);
    }
}
