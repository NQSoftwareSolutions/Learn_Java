package java_complete_reference.data_types_variables_arrays;

public class VarDemo {
    public static void main (String ... arg){
        // as context sensitive variable
        var i = 23.34;
        System.out.println("i is "+i);

        // as an identifier
        int var = 23;
        System.out.println("var is "+var);

        //declare an array by var
        var array = new int[10];
        int k=1;

        for (int j = 0; j < array.length; j++){
            array[j] = k;
            System.out.print(array[j]+"\t\t");
            k++;
        }
    }
}
