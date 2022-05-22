package java_complete_labs_oracle;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataFormatterDemo {
    public static void main (String... arg){
        //Todo Set date format
        String dateFormatter = "d MMMM, yyyy h:mm:ss A";

        //Todo set Locale
        Locale locale = Locale.UK;

        //Todo set zone id
        ZoneId zoneIdKathmandu = ZoneId.of("Asia/Kathmandu");
        ZoneId zoneIdKarachi = ZoneId.of("Asia/Karachi");

        //Todo set time
        LocalDateTime teaTime = LocalDateTime.now();

        //Todo get a time of specific zone
        ZonedDateTime kathmanduTime = ZonedDateTime.of(teaTime,zoneIdKathmandu);
        ZonedDateTime karachiTime = ZonedDateTime.of(teaTime,zoneIdKarachi);

        //Todo get off set of kathmandu by GMT
        ZoneOffset kathmanduOffset = kathmanduTime.getOffset();
        ZoneOffset karachiOffset = karachiTime.getOffset();

        //Todo set date time formatter with locale
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormatter,locale);
        System.out.println(kathmanduTime.format(dtf));

        //Todo format to date

        String time = DateTimeFormatter.ofPattern(dateFormatter).format(kathmanduTime);
        System.out.println(time +" & kathmandu offset difference is "+kathmanduOffset);
        time = DateTimeFormatter.ofPattern(dateFormatter).format(karachiTime);
        System.out.println(time +" & karachi offset difference is "+karachiOffset);
    }
}
