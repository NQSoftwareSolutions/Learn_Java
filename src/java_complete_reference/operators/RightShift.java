package java_complete_reference.operators;

class RightShift {
    public static void main (String ... arg){
        int n = 0x0FFFFF;
        for (int i = 0; i < 21; i++){
            n = n >> 1;// Result can be in -ve b/c >> shifts 1 & left lower bit on every shift.
            System.out.print("\t\tNum : "+n);
        }
    }
}
