package java_complete_labs_oracle;

public class PrimitivesCasting {
    public static void main(String... arg){
        byte x = 2, y = 3 , z = 5;

        // todo casting result
        float a = (float) ( x / y);
        System.out.println("Casting result float : "+ a);

        //todo casting any of expression member value
        a = (float) x / y;
        System.out.println("Casting value float : "+ a);

        // todo casting result
        double b = (double) ( x / y);
        System.out.println("Casting result double : "+ b);

        //todo casting any of expression member value
        b = (double) x / y;
        System.out.println("Casting value double : "+ b);
    }
}
