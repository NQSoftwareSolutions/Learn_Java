package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

import static java_complete_reference.data_types_variables_arrays.MethodsDefinition.*;

class LightDistance {
    public static void main (String ... arg){
        /*
         * Todo:  Purpose
         * This program will get days in which we want to get distance covered by light..
         * This program will demonstrate the use of long integer
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Compute distance of light in days \nInter Days ");
        int days = scanner.nextInt();
        System.out.println("Light will cover "+
                lightDistance(days)+" Miles in "+days+" days");
    }
}
