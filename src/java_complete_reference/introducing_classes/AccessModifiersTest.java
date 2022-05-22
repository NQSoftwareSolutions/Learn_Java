package java_complete_reference.introducing_classes;

public class AccessModifiersTest {
    public static void main (String ... arg){
        AccessModifiers ob = new AccessModifiers(1,2,3);
        int i = ob.i;
        int j = ob.j;
        int k = ob.getK();// this is how we get a private method by method
                            // but we get it directly as we get above instance cars

        System.out.println("Sum of All Vars is : "+ ob.sum(i,j,k));
    }
}
