package interview;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class GetSecondHighestNumberFromArray {
    public static void main(String[] args) {
        int array[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
        int largest = 0;
        int secondLargest = 0;

        //Todo #1 way to get second largest number
//        int num = getSecondLargeNumber(array);
//        System.out.println("Second largest number is "+num);

        //Todo #2 way to get second largest number
        for (int j : array) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }

        for (int k : array) {
            System.out.print(k + "\t");
        }

        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: "  +largest);
    }

    private static int getSecondLargeNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length-2];
    }
}
