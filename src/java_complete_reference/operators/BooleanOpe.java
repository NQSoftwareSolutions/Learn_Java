package java_complete_reference.operators;

class BooleanOpe {
    public static void main (String ... arg){
        boolean a = true, b = false, c = a | b, d = a & b, e =  a ^ b, f = (!a & b) | (a & !b), g = !a;

        System.out.print(
                "a : "+a+"\n" +
                "b : "+b+"\n" +
                "c : "+c+"\n" +
                "d : "+d+"\n" +
                "e : "+e+"\n" +
                "f : "+f+"\n" +
                "g : "+g);
    }
}
