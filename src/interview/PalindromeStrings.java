package interview;

public class PalindromeStrings {
    public static void main(String[] args) {
        palindromeString("Abdul");
        palindromeString("Qayoom");
        palindromeString(66);
        palindromeString(99);
        palindromeString(63);
    }

    private static void palindromeString(String string) {
        StringBuilder reverse = new StringBuilder();
        for(int i=string.length(); i > 0; --i){
            reverse.append(string.charAt(i - 1));
        }
        String reversedString = String.valueOf(reverse);
        if (string.equalsIgnoreCase(reversedString)){
            System.out.println(string +" is palindrome an string");
        }else System.out.println(string +" is not palindrome an string");
    }

    private static void palindromeString(int number) {
        String sNumber = String.valueOf(number);
        StringBuilder reverse = new StringBuilder();
        for(int i=sNumber.length(); i > 0; --i){
            reverse.append(sNumber.charAt(i - 1));
        }
        String reversedString = String.valueOf(reverse);
        if (sNumber.equalsIgnoreCase(reversedString)){
            System.out.println(number +" is palindrome a number");
        }else System.out.println(number +" is not palindrome a number");
    }
}
