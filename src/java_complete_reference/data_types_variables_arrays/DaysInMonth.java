package java_complete_reference.data_types_variables_arrays;

import java.util.Scanner;

import static java_complete_reference.data_types_variables_arrays.MethodsDefinition.*;

class DaysInMonth {
    public static void main (String ... arg){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Get the Days in Specified month\n" +
                "Inter Month Name(eg: Jan,jan,January,january) : ");
        String monthName = scanner.next();
        System.out.println(monthName+" has "+daysOfMonth(monthName)+" days");
    }
}
