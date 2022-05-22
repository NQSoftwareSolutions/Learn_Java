package java_complete_reference.data_types_variables_arrays;

class Casting {
    public static void main (String ...  arg){
        byte b = 20;
        short s = 10;
        int i;

        //(widening)Atomic conversion small into large
        i = b;
        System.out.println("i is "+i);
        i = s;
        System.out.println("i is "+i);

        //(Narrowing) Casting ? large into small
        int j = 257;// is large then byte so here automatic co
        byte b1 = (byte) j;// convert int to byte (i % 256)
        System.out.println("conversion of int to byte\n" +
                "int i : "+i+"\n" +
                "byte b "+b);
        System.out.println("This happen here");
        int cal = j % 256;
        System.out.println("calculate "+ cal);

        // (Truncate) conversion floating point value to non floating point value
        int k;
        double d = 1345.3434;
        byte b2;
        k = (int) d;// convert double to int
        System.out.println("conversion of double to int\n" +
                "double d : "+d+"\n" +
                "int i "+k);

        b2 = (byte) d;// convert double to byte(d % 256)
        System.out.println("conversion of double to byte\n" +
                "double d : "+d+"\n" +
                "byte b "+b2);
        System.out.println("This happen here");
        double cal2 = d % 256;
        System.out.println("calculate "+ cal2);
    }
}
