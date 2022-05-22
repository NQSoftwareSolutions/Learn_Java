package java_complete_reference.introducing_classes;

public class ReturnObjectTest {
    public static void main(String ... arg){
        ReturnObject obj = new ReturnObject(23,45);

        System.out.println("Object : "+obj);

        System.out.println("Returned object  from method : "+obj.rObject(43,45));
    }
}
