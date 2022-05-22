package java_complete_reference.operators;

class CompoundAssignment {
    public static void main (String ... arg){
        float a = 34.4f,b = 34.3f,c = 56.6f;

        a += b;
        System.out.println("a "+a);
        b /= c;
        System.out.println("b "+b);
        c *= a;
        System.out.println("c "+c);
        a %= 2;
        System.out.println("a "+a);
        c -= b;
        System.out.println("c "+c);
    }
}
