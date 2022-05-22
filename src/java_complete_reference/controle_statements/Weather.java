package java_complete_reference.controle_statements;

import javax.sound.midi.Soundbank;
import java.time.MonthDay;
import java.util.Scanner;

class Weather {
    public static void main (String ... arg) {
        MonthDay month = MonthDay.now();
        String m = String.valueOf(month);
        m = m.substring(2,4);

        int monthI = Integer.parseInt(m);

        String weather = switch (monthI) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            default -> "Autumn";
        };
        System.out.println("Current weather is "+weather);
    }
}
