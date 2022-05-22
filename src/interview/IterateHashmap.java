package interview;

import java.util.HashMap;
import java.util.Map;

public class IterateHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "Abdul");
        map.put(25, "Qayoom");
        map.put(12, "Jat");
        for(Map.Entry entry: map.entrySet()) {
            System.out.println("Key is: " + entry.getKey() +
                    " Value is: " + entry.getValue());
        }
    }
}
