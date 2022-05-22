package java_complete_reference.operators;

class LeftShiftV2 {
    public static void main (String ... arg){
        int n = 0XFFFFFFE;//this is int number in hex form
        for (int i = 0; i < 31 ; i++){
            n = n << 1; // This result will finally become 0 b/c this will shift bits to left and replace previous bit with 0
            System.out.print("\t\tNum : "+n);
        }
    }
}
