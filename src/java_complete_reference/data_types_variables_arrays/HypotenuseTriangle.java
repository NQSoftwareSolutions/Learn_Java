package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

class HypotenuseTriangle {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Find Hypotenuse of Triangle \n" +
                "Inter value of side A : ");
        double a = scanner.nextDouble();
        System.out.print("Inter value of Side B : ");
        double b = scanner.nextDouble();

        System.out.println("Hypotenuse is "+ MethodsDefinition.hypotenuse(a,b));
    }
}
