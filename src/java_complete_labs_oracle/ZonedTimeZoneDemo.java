package java_complete_labs_oracle;

import java.time.*;

public class ZonedTimeZoneDemo {
    public static void main(String... arg){
        //Todo set some zone ID
        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        System.out.println("Katmandu id is "+katmandu);

        ZoneId london = ZoneId.of("Europe/London");
        System.out.println("London id is "+london);

        //Todo set an event on any date
        LocalTime teaTime = LocalTime.of(17,30);
        System.out.println("My Tea time is "+teaTime);
        LocalDate today = LocalDate.now();
        System.out.println("Today is "+today);
        LocalDateTime tTeaTime = LocalDateTime.of(today.plusDays(1),teaTime);
        System.out.println("Tomorrow Tea Time is "+tTeaTime);

        //Todo set zone times
        ZonedDateTime londonTime = ZonedDateTime.of(tTeaTime,london);
        System.out.println("London time is "+londonTime);

        ZonedDateTime katmanduTime = ZonedDateTime.of(tTeaTime,katmandu);
        System.out.println("London time is "+katmanduTime);

        //Todo check katmandu time on london time
        katmanduTime = londonTime.withZoneSameInstant(katmandu);
        System.out.println("London time is "+londonTime+"" +
                " \n\t& on that time Katmandu time is "+katmanduTime);

        //Todo get the offset of time zone
        ZoneOffset katmanduOffset = katmanduTime.getOffset();
        System.out.println("Offset of katmandu time zone is "+katmanduOffset);

        ZoneOffset londonOffset = londonTime.getOffset();
        System.out.println("Offset of london time zone is "+londonOffset);

    }
}
