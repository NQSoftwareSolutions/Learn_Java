package interview;

public class FibonacciSeries {
    public static void main(String[] args) {
        getFibonacciSeries(10);
        getFibonacciSeries(10,10);
        getFibonacciSeries(20,10);
        }
    public static void getFibonacciSeries(int times){
        int num1 = 0 , num2 = 0, sum = 1;
        for (int i = 0; i < times; i++){
            num1 = num2;
            num2 = sum;
            sum = num1 + num2;
            System.out.print("\t"+sum);
        }
    }

    public static void getFibonacciSeries
            (int startingNumber, int times){
        int num2 = 0, sum = startingNumber;
        for (int i = 0; i < times; i++){
            startingNumber = num2;
            num2 = sum;
            sum = startingNumber + num2;
            System.out.println("\t"+sum);
        }
    }
}
