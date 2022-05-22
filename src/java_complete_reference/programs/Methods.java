package java_complete_reference.programs;

import java.time.LocalTime;

public class Methods {
    public static int countWords(String string){
        int words = 0;
        return words;
    }
    public static int startTime (){
        LocalTime t = LocalTime.now();
        String s = " ";
        s.concat(" "+t);
        int time = Integer.parseInt(s);
        return time;
    }
}
