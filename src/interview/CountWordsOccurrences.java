package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountWordsOccurrences {
    public static void main(String[] args) {
        String receivedEmail = "Good Morning Abdul Qayoom - \n" +
                "\n" +
                "Thank you for taking the time to speak with Ahmed and me yesterday about our open position at The Imagination Warehouse.\n" +
                "\n" +
                "We enjoyed speaking with you and would like to discuss the opportunity further with you.\n" +
                "\n" +
                "To that end, Ahmed will be reaching out to you to set up an additional video interview with one of our primary Java Developers so that you can speak in a little more complexity.\n" +
                "\n" +
                "Please be on the lookout for Ahmed’s call in the morning.\n" +
                "\n" +
                "Thank you again - \n" +
                "\n" +
                "Jim";
        System.out.println(findOccurrences(receivedEmail));
    }

    public static Map<String,Integer> findOccurrences(String msg){
        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = msg.split(" ");
        for (String word : words) {
            hashMap.merge(word, 1, Integer::sum);
        }
        return hashMap;
    }
}
