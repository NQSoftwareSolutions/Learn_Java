package java_complete_reference.introducing_classes;

public class ArgPassByRefTest {
    public static void main (String ... arg){
        int a = 12,b = 23;
        ArgPassByRef ob = new ArgPassByRef(a,b);

        System.out.println("Before call a & b = "+ob.a+" : "+ob.b);

        ob.math(ob);

        System.out.println("After call a & b = "+ob.a+" : "+ob.b);

        // you will notice change in before and after b/c object is not value but it reference of class obj
    }
}
