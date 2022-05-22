package java_complete_reference.data_types_variables_arrays;

class OneDimensionalArrayV2 {
    public static void main (String ... arg){
        /*
        todo : purpose
        create a professional program of   OneDimensionalArray
         */
        //Declare and Initialize in one statement
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        //step 2 Access all elements of monthDays array by loop and print their days by specified month name
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
}
