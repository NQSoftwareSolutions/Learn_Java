package java_complete_reference.controle_statements;

class ContinueForEach {
    public static int sum = 0;
    public static void main (String ... arg){
        int[] matrix = {0,1,2,3,4,5,6,7,8,9};
        for (var i : matrix){
            sum += i;
            if (sum == 10){
                continue;//continue will continue(stop loop and start again from next inst) current iteration to next when sum == 10
            }
            System.out.print("\t\t sum is : "+sum);
        }
    }
}
