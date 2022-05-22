package java_complete_reference.data_types_variables_arrays;

import static java_complete_reference.data_types_variables_arrays.OneDimensionalArray.*;

class MethodsDefinition {
    public static long lightDistance (int days){
        var LIGHT_SPEED = 186000;// miles / seconds
        var seconds = days * 24 * 60 * 60;
        return LIGHT_SPEED * seconds;
    }
    public static  double areaOfCircle(double radius){
        final var PI = 3.1416;
        return PI * radius * radius;
    }
    public static char unicodeCharSet(int character){
        return (char )character;
    }
    public static int charToUnicode (char character){
        return character;
    }
    public static char getChar(String character){
        char[] chars = character.toCharArray();//convert java_complete_reference.string into array of chars
        return chars[0];
    }
    public static boolean unicodeQuiz(char character, int unicode){
        boolean ans;
        ans = character == unicode;
        return ans;
    }
    public static double hypotenuse (double sideA, double sideB){
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
    public static int daysOfMonth (String monthName){
        var monthDays = 0;
        switch (monthName) {
            case "January", "january", "Jan", "jan" -> monthDays = monDays(0);
            case "February", "february", "Feb", "feb" -> monthDays = OneDimensionalArray.monthDays[1];
            case "March", "march", "Mar", "mar" -> monthDays = OneDimensionalArray.monthDays[2];
            case "April", "april", "Apr", "apr" -> monthDays = OneDimensionalArray.monthDays[3];
            case "May", "may" -> monthDays = OneDimensionalArray.monthDays[4];
            case "June", "june", "Jun", "jun" -> monthDays = OneDimensionalArray.monthDays[5];
            case "July", "july", "Jul", "jul" -> monthDays = OneDimensionalArray.monthDays[6];
            case "August", "august", "Aug", "aug" -> monthDays = OneDimensionalArray.monthDays[7];
            case "September", "september", "Sep", "sep" -> monthDays = OneDimensionalArray.monthDays[8];
            case "October", "october", "Oct", "oct" -> monthDays = OneDimensionalArray.monthDays[9];
            case "November", "november", "Nov", "nov" -> monthDays = OneDimensionalArray.monthDays[10];
            case "December", "december", "Dec", "dec" -> monthDays = OneDimensionalArray.monthDays[11];
            default -> System.out.println("Put Correct Name");
        }
        return monthDays;
    }
}
