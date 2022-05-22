package interview;
import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayListUsingLoops {
    public static void main(String[] args) {
        ArrayList<Integer> list = createNumberArrayList(10,20);

        System.out.println(list.size());
        System.out.println("While Loop:");
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Advanced For Loop:");
        for(Object s : list) {
            System.out.println(s);
        }
        System.out.println("For Loop:");
        for(int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static ArrayList<Integer> createNumberArrayList
            (int startingNumber, int endingNumber) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = startingNumber; i <= endingNumber; i++){
            number.add(i);
        }
        return number;
    }
}
