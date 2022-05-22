package java_complete_reference.introducing_classes;

public class OverloadingCasting {
    // comment this methods for demonstration and also test with out comment will show you automatic casting..
//   int m(int i){
//       System.out.println("Integer "+i);
//        return i;
//    }
    double m(double d){
        System.out.println("Double "+d);
       return d;
    }
    void m (int i, int j){
        System.out.println("Integer i = "+j+" Integer j = "+ j);
    }
    // create OverloadingCastingTest Class to test
}
