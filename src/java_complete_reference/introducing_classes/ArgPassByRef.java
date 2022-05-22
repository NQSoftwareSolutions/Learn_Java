package java_complete_reference.introducing_classes;

public class ArgPassByRef {
    double a , b;

    public ArgPassByRef(double i, double j) {
        a = i;
        b = j;
    }

    void  math (ArgPassByRef ob){
        ob.a *= 2;
        ob.b /= 2;
    }
    // ArgPassByRefTest
}
