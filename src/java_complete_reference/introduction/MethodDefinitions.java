package java_complete_reference.introduction;

public class MethodDefinitions {
    public static void sum(int i,int j){
        int k = i+j;
        System.out.println("Sum = "+k);
    }
    public static void multiply(int i,int j){
        System.out.println("Multiply = "+i*j);
    }
    public static void sub(int i,int j){
        int k = i-j;
        System.out.println("Sub = "+k);
    }
    public static void divide(int i,int j){
        System.out.println("Divide = "+i/j);
    }
    public static void mod(int i,int j){
        System.out.println("Modulus = "+i%j);
    }
    public static void equalTo(int i,int j){
        boolean k = i == j;
        System.out.println(i+" is equal to "+j+" is "+k);
    }
    public static void greaterThen(int i,int j){
        boolean k = i > j;
        System.out.println(i+" is greater "+j+" is "+k);
    }
    public static void lessThen(int i,int j){
        boolean k = i < j;
        System.out.println(i+" is less then "+j+" is "+k);
    }
    public static void notEqualTo(int i,int j){
        boolean k = i != j;
        System.out.println(i+" is not equal to "+j+" is "+k);
    }
    public static void greaterThenEqualTo(int i,int j){
        boolean k = i >= j;
        System.out.println(i+" is greater then equal to "+j+" is "+k);
    }
    public static void lessThenEqualTo(int i,int j){
        boolean k = i <= j;
        System.out.println(i+" is less then equal to "+j+" is "+k);
    }
    public static void logicalOperators(int i,int j){
        /*
        Logical operators used in condition evolution from more then one condition and return TRUE or FALSE...
        OR(||) operator return  TRUE if any one of condition is TRUE else FALSE...
        AND(&&) operator return TRUE if both of condition are TRUE else FALSE...
        NOT(!) operator is used to get opposite if TRUE then return False .. if FALSE then return TRUE...
         */
        if (i == j || i != j){
            System.out.println("OR execute");
        }
        else {
            System.out.println("OR not execute");
        }
        if (i == j && i != j){
            System.out.println("AND execute");
        }
        else {
            System.out.println("AND not execute");
        }
        boolean k = i == j;
        System.out.println("k is "+k+" \"NOT Operation\" !k is : "+!k);
    }
}
