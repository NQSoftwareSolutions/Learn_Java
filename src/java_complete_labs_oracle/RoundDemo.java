package java_complete_labs_oracle;

public class RoundDemo {
    // Demo of Round
    public static void main(String ... arg){
        int a = 11 , b = 3;

        float x = (float) (a/b);
        System.out.println(x);
        float f = Math.round((x * 1000) / 1000F);
        System.out.println("After multiply & devide with float And cast with result : "+f);

        double y = (double) a/b;
        System.out.println(y);
        float g = Math.round(y * 1000) / 1000F;// round upto 3 digits
        System.out.println("After multiply & devide with float And cast with any expression value : "+g);

        System.out.println(y);
        g = Math.round(y * 10000) / 10000F;// round upto 4 digits
        System.out.println("After multiply & devide with float And cast with any expression value : "+g);
    }
}
