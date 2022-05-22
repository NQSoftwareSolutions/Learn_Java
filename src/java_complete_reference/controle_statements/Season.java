package java_complete_reference.controle_statements;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Season {
    public static void main (String ... arg){
        MonthDay month = MonthDay.now();
        String m = String.valueOf(month);
        m = m.substring(2,4);

        int monthI = Integer.parseInt(m);
        String season;

        if (monthI == 12 || monthI == 1 || monthI == 2)
            season = "Winter";
        else if (monthI == 3 || monthI == 4 || monthI == 5)
            season = "Spring";
        else if (monthI == 6 || monthI == 7 || monthI == 8)
            season = "Summer";
        else season = "Autumn";

        System.out.println("Current Season is "+season);
    }
}
