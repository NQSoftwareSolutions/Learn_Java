package java_complete_reference.operators;

class Operators {
    public static void main (String ... arg){
        int sum = 1 + 1;
        int div = 11 / 2;
        int mul = 3 * 2;
        int sub = 3 - 2;
        int unaryMinus = -mul;
        int unaryPlus = +div;
        System.out.println("Integers \nAddition "+sum+"\n" +
                "Division "+div+"\n" +
                "Multiplication "+mul+"\n" +
                "subtraction "+sub+"\n" +
                "UnaryMinus "+unaryMinus+"\n" +
                "Unary Plus "+unaryPlus);
        System.out.println();
        double dsum = 1.5 + 1;
        double ddiv = 11.0 / 2;
        double dmul = 3.6 * 2;
        double dsub = 3.3 - 2;
        double uMinus = -dmul;
        double uPlus = +ddiv;
        System.out.println(" Double \nAddition "+dsum+"\n" +
                "Division "+ddiv+"\n" +
                "Multiplication "+dmul+"\n" +
                "subtraction "+dsub+"\n" +
                "Unary minus "+uMinus+"\n" +
                "Unary Plus "+uPlus);
    }
}
