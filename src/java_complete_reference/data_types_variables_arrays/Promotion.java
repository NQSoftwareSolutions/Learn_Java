package java_complete_reference.data_types_variables_arrays;

public class Promotion {
    public static void main (String ... arg){
        int mul = promoteInt(12,34);
        System.out.println(mul);

        double sum = promoteDouble(23,34,34);
        System.out.println(sum);
    }

    public static int promoteInt(int i1, int i2){
        byte b =(byte) i1;
        short s = (short) i2;
        return (short) (b * s);//this will be int b/c expression will automatically promote to int
    }

    public static double promoteDouble(int i1, int i2,double d){
        return (i1+i2+d);//this will be int b/c expression will automatically promote to double
        // b/c we are adding one double var to ints
    }
}
