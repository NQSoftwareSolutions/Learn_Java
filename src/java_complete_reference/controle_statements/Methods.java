package java_complete_reference.controle_statements;

class Methods {
    public static double intToDouble(double number){
        String s = String.valueOf(number);
        s.concat(s+".0");
       return number = Double.parseDouble(s);
    }
    public static boolean testPrime(int number){
        boolean isPrime = false;
        isPrime = number < 2 ? false : true;
        for (int i = 2; i <= number/i; i++){
            isPrime = number % i == 0 ? false : true;
            break;
        }
        return isPrime;
    }
    public static int[] createArray (int sNum,int eNum){

        int sizeArray = eNum - sNum;
        int[] array = new int[sizeArray+1];
        int index = 0;
        while (sNum <= eNum){
            array[index] = sNum;
            index++;
            sNum++;
        }
        return array;
    }
}
