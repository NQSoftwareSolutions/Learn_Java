package java_complete_reference.introducing_classes;

public class ObjectAsParamTest {
    public static void main (String ... arg){
        // create objects of ObjectAsParam class
        ObjectAsParam op = new ObjectAsParam(12,34);
        ObjectAsParam op1 = new ObjectAsParam(-1,-1);
        ObjectAsParam op2 = new ObjectAsParam(12,34);

        System.out.println("Op == op1 : "+op.equalTo(op1));
        System.out.println("op == op2 : "+op.equalTo(op2));
    }
}
