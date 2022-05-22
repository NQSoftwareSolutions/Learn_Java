package interview;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Abdul Qayoom"));
    }
    public static String reverseString(String string){
        StringBuilder builder = new StringBuilder();
        builder.append(string);
        String reversedString = String.valueOf(builder.reverse());
        return String.valueOf(reversedString);
    }
}
