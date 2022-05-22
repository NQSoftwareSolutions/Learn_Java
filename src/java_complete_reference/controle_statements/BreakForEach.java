package java_complete_reference.controle_statements;

class BreakForEach {
    public static int sum = 0;
    public static void main (String ... arg){
        int[] matrix = {0,1,2,3,4,5,6,7,8,9};
        for (var i : matrix){
            sum += i;
            if (sum == 10){
                System.out.print("\t\t sum is : "+sum);
                break;
            }
            System.out.print("\t\t sum is : "+sum);
        }
    }
}
