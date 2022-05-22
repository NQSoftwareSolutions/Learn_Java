package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

import static java_complete_reference.data_types_variables_arrays.MethodsDefinition.areaOfCircle;

public class AreaOfCircle {
    public static void main (String ... arg){
        /*
          todo : Purpose
          This program will demonstrate the use double data type
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Calculate area of the circle \n" +
                "Inter radius : ");
        double rad = scanner.nextDouble();
        System.out.println("Area of circle by radius "+rad +" is "+areaOfCircle(rad));
    }
}
