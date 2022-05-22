package java_complete_reference.introducing_classes;

public class RecursionTest {
    public static void main (String... arg){
        Recursion rec = new Recursion(20);

        int i;

        for (i = 0 ; i < rec.num; i++) rec.values[i] = i;

        rec.printArray(rec.num);
    }
}
