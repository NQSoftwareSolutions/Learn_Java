package java_complete_reference.data_types_variables_arrays;

class TwoDArrayV2 {
    public static void main (String ... arg){
        // Declare 2D array with unequal dimensions
        int[][] matrix = new int[4][];
        matrix[0] = new int[1];
        matrix[1] = new int[2];
        matrix[2] = new int[3];
        matrix[3] = new int[4];

        int i,j,k=0;
        for (i = 0;i < 4;i++)
            for (j =0;j < i+1;j++){
                matrix [i] [j] = k;
                k++;
            }
        for (i = 0;i < 4;i++){
            for (j =0;j < i+1;j++)
                System.out.print(matrix[i][j]+" ");
              System.out.println();
            }
    }
}
