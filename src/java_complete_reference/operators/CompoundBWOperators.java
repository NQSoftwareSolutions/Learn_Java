package java_complete_reference.operators;

class CompoundBWOperators {
    public static void main (String ... arg){
        int a = 3,b = 6, c = 9,d = 12, e = 15, f = 18;

        a |= b;
        b >>= 2;
        c &= d;
        f ^= 4;
        d <<= 5;
        e >>>= 6;
        System.out.println(
                "  a |= : "+a+"\n" +
                " b >>= : "+b+"\n" +
                "  c &= : "+c+"\n" +
                " d <<= : "+d+"\n" +
                "e >>>= : "+e+"\n" +
                "  f ^= : "+f);

    }
}
