package java_complete_reference.introducing_classes;

public class ArgPassByValueTest {
    public static void main (String ... arg){
        ArgPassByValue ob = new ArgPassByValue();

        int a = 12 , b = 23;

        System.out.println("Before call a & b = "+a+" : "+b);

        ob.math(a,b);

        System.out.println("After call a & b = "+a+" : "+b);

        // you will notice no change in before and after
    }
}
