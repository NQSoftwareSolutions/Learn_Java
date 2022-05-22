package java_complete_reference.data_types_variables_arrays;

class TwoDArray {
    public static void main (String ... arg){
        int[][] matrix = new int[4][5];
        int i,j,k=0;

        for (i = 0;i < 4; i++)
            for (j = 0; j < 5; j++) {
                matrix[i][j] = k;
                k++;
            }
        for (i = 0;i < 4; i++){
            for (j = 0; j < 5; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
