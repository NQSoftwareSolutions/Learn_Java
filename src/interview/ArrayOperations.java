package interview;
import java.util.ArrayList;

public class ArrayOperations {
    public static void main(String[] args) {
        String stringArray = "4 5 29 54 4 0 -214 542 -64 1 -3 6 -6";
        int[] integerArray = {4, 5, 29, 54, 4, 0, -214, 542, -64, 1, -3, 6, -6};

        int largest = getLargestFromStringNumbs(stringArray);
        System.out.println(largest+" is largest of all");

        int largestNum = getLargestFromArray(integerArray);
        System.out.println(largestNum +" is largest of all");

        int smallest = getSmallestFromStringNumbs(stringArray);
        System.out.println(smallest+" is smallest of all.");

        int smallestNum = getSmallestFromArray(integerArray);
        System.out.println(smallestNum +" is smallest of all");
    }

    private static int getSmallestFromStringNumbs(String StringNumbers) {
        String[] stringNumbers = getListOfWords(StringNumbers);
        ArrayList<Integer> listOfNumbers =
                convertStringArrayNumbsToIntegers(stringNumbers);
        return getSmallestFromArrayList(listOfNumbers);
    }

    private static int getSmallestFromArrayList
            (ArrayList<Integer> listOfNumbers) {
        int smallest = 0;
        for (int num : listOfNumbers){
            if (num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }

    private static int getSmallestFromArray
            (int[] integerArray) {
        int smallest = 0;
        for (int num : integerArray){
            if (num < smallest){
                smallest = num;
            }
        }
        return smallest;
    }


    private static int getLargestFromStringNumbs(String stringArray) {
        String[] stringNumbers = getListOfWords(stringArray);
        ArrayList<Integer> listOfNumbers =
                convertStringArrayNumbsToIntegers(stringNumbers);
        return getLargestFromArrayList(listOfNumbers);
    }

    private static int getLargestFromArrayList
            (ArrayList<Integer> listOfNumbers) {
        int largest = 0;
        for (int num: listOfNumbers){
            if (num > largest){
                largest = num;
            }
        }
        return largest;
    }

    private static int getLargestFromArray
            (int[] numbersArray) {
        int largest = 0;
        for (int num: numbersArray){
            if (num > largest){
                largest = num;
            }
        }
        return largest;
    }

    private static ArrayList<Integer> convertStringArrayNumbsToIntegers
            (String[] stringNumbers) {
        ArrayList<Integer> listOfNumber = new ArrayList<>();
        for (String num : stringNumbers){
            listOfNumber.add(Integer.parseInt(num));
        }
        return listOfNumber;
    }

    private static String[] getListOfWords(String stringArray) {
        return stringArray.split(" ");
    }
}
