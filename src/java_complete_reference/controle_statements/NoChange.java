package java_complete_reference.controle_statements;

class NoChange {
    public static void main (String ... arg){
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        // inside loop we changing controlling var
        for (int x : num){
            System.out.print("\t\t"+x);
            x = x * 10;//changing x
        }
        System.out.println();
        for (int x : num) System.out.print("\t\t"+x);
        System.out.println("\n\t\tCompare both have equal values");
    }
}
