package java_complete_reference.controle_statements;

class ForEachNDArrays {
    public static void main (String ... arg){
        int[][] matrix = new int[3][5];
        int sum = 0;
        //give some values to matrix
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                matrix [i][j] =  (i+1)*(j+1);
        //use for each to display the values
        for (int[] x : matrix){
            /*
            x is declared. It is a reference to a one-dimensional array of integers.
            This is necessary because each iteration of the for obtains the next
            array in nums, beginning with the array specified by nums[0]. The inner for
            loop then cycles through each of these arrays, displaying the values of each
            element.
            */
            for (int y : x){
                System.out.print("\t\t"+y);
                sum += y;
            }
            System.out.println();
        }
        System.out.println("sum is "+sum);
    }
}
