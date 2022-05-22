package java_complete_reference.controle_statements;

class Comma {
    public static void main (String ... arg){
        int a, b = 11;
        //Loop which governed by two vars a & b
        for (a = 1; a <= b ; a ++){
            System.out.print(a+" : "+b+"\t\t");
            b--;
        }
        System.out.println();
        int c , d;

        // use of comma in loop both governing vars in iteration statement by use of comma
        for (c = 1, d = 11; c <= d ; ++c , d-- ) System.out.print(c +" : "+d+"\t\t");
    }
}
