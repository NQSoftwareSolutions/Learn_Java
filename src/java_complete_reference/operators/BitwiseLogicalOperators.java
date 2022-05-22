package java_complete_reference.operators;

class BitwiseLogicalOperators {
    public static void main (String ... arg){
        String[] binary = {
                "0000","0001","0010","0011","0100","0101","0110","0111",
                "1000","1001","1010","1011","1100","1101","1110","1111",
        };
        int a = 3,b = 6,c = a | b,d = a & b,e = a ^ b,f = (~a & b) | (a & ~b),g = ~a & 0X0f;
        System.out.println(
                "                  a = "+ binary [a]+"\n" +
                "                  b = "+ binary [b]+"\n" +
                "             a | b  = "+ binary [c]+"\n" +
                "              a & b = "+ binary [d]+"\n" +
                "              a ^ b = "+ binary [e]+"\n" +
                "(~a & b) | (a & ~b) = "+ binary [f]+"\n" +
                "          ~a & 0X0f = "+ binary [g]+"\n");
    }
}
