package java_complete_reference.introducing_classes;

public class OverloadingTest {
    public static void main (String ... arg){
        Overloading overloading = new Overloading(12);
        double m1 = overloading.m(12);//invoke the param1 method
        double m2 = overloading.m(23,23,23);//invoke the param3 method
        double m3 = overloading.m(34,34);//invoke the param2 method

        double result = m1 + m2 + m3;
        System.out.println("Method 1 = "+m1+"\n" +
                "Method 2 = "+m2+"\n" +
                "Method 3 = "+m3+"\n" +
                "Result is = "+result);
    }
}
