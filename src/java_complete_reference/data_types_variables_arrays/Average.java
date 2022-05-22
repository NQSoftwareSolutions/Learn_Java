package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

class Average {
    public static void main (String ... arg){
        float sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Get average or provide numbers\n" +
                "Total Members : ");
        int members = scanner.nextInt();

        for (int i = 0; i < members; i++){
            System.out.print("Inter Value : ");
            float value = scanner.nextInt();
            sum += value;
        }
        System.out.println("Average is "+sum/members);
    }
}
