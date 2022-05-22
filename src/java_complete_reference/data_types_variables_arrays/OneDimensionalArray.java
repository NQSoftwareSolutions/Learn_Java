package java_complete_reference.data_types_variables_arrays;

class OneDimensionalArray {

    //Step 1 Declare an Array
    public static int[] monthDays;

    public static void main (String ... arg){
        /*
          todo Purpose
          Demonstrate the one dimensional array
          TODO : Task : Create array of months of years and define their days in each month and print them.
         */

        //step 2 allocate memory
        monthDays = new int[12];

        //step 3 Assign value at each index

        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;

        //step 4 Access all elements of monthDays array by loop and print their days by specified month name
        for (int i = 0; i < monthDays.length; i++){
            switch (i) {
                case 0 -> System.out.println("January has " + monthDays[0] + " days in month");
                case 1 -> System.out.println("February has " + monthDays[1] + " days in month");
                case 2 -> System.out.println("March has " + monthDays[2] + " days in month");
                case 3 -> System.out.println("April has " + monthDays[3] + " days in month");
                case 4 -> System.out.println("May has " + monthDays[4] + " days in month");
                case 5 -> System.out.println("June has " + monthDays[5] + " days in month");
                case 6 -> System.out.println("July has " + monthDays[6] + " days in month");
                case 7 -> System.out.println("August has " + monthDays[7] + " days in month");
                case 8 -> System.out.println("September has " + monthDays[8] + " days in month");
                case 9 -> System.out.println("October has " + monthDays[9] + " days in month");
                case 10 -> System.out.println("November has " + monthDays[10] + " days in month");
                default -> System.out.println("December has " + monthDays[11] + " days in month");
            }
        }
    }
    public static int monDays(int daysIndex){
        return monthDays[daysIndex];
    }
}
