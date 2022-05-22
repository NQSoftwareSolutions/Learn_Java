package java_complete_reference.introducing_classes;

public class ObjectAsParam {
    int a, b;

    public ObjectAsParam(int i, int j) {
        a = i;
        b = j;
    }
    boolean equalTo (ObjectAsParam o){
        boolean b1 = o.a == a && o.b == b ? true : false;
        return b1;
    }
    // create class ObjectAsParamTest class
}
