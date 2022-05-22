package java_complete_reference.controle_statements;

import static java_complete_reference.controle_statements.Methods.createArray;

class ForEachVar {
    public static void main (String ... arg){
       int[] num = createArray(21,30);
       //VAR with for-each
       for (var x : num) System.out.print("\t\t"+x);//var in for each print values of array
        System.out.println();
        //VAR in traditional for
        for (var i = 0.0; i < num.length;i++) System.out.print("\t\t"+i);// var in for print i
    }
}
