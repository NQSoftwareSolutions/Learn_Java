package java_complete_reference.operators;

class IncrementOperator {
    public static void main (String ... arg){
        int a = 3,b = 2, c,d;

        c  = ++a;
        d  = ++b;
        System.out.println("prefix : "+ (++c));
        System.out.println("prefix : "+ (++d));
        c  = a++;
        d  = b++;
        System.out.println("postfix : "+ (c++));
        System.out.println("c is "+c);
        System.out.println("postfix : "+ (d++));
        System.out.println("d is "+d);
    }
}
