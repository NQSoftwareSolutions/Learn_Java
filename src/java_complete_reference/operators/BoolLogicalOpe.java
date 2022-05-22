package java_complete_reference.operators;

class BoolLogicalOpe {
    public static void main (String ... arg){
        boolean a,b,c,and,or,xor,scor,scand,not,andA,orA,xorA,equalTo,notEqualTo,ternary;
        a = c = true;//we will make all operations of a & b & c only
        b = false;


        and = a &  b & c;
        or = a |  b | c;
        xor = a ^  b ^ c;
        scor = a ||  b || c;
        scand = a && b && c;
        not = !a;
        andA = a &= b;
        orA = b |= a;
        xorA = c ^= a;
        equalTo = a == b;
        notEqualTo = a != b;
        ternary = a ? c : b;

        System.out.print("and : "+and+"\n" +
                "or : "+or+"\n" +
                "xor : "+xor+"\n" +
                "scor : "+scor+"\n" +
                "scand : "+scand+"\n" +
                "not : "+not+"\n" +
                "andA : "+andA+"\n" +
                "orA : "+orA+"\n" +
                "xorA : "+xorA+"\n" +
                "equalTo : "+equalTo+"\n" +
                "notEqualTo : "+notEqualTo+"\n" +
                "ternary : "+ternary+"\n");


    }
}
