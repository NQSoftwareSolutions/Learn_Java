package java_complete_reference.operators;

class UnsignedRShift {
    public static void main (String ... arg){
        int n = 32;
        for (int i = 0; i < 10; i++){
            n = n >>> 1;//result will not be in -ve b/c this >>> will shift 0 in higher bit on every shift
            System.out.print("\t\t"+n);
        }

    }
}
