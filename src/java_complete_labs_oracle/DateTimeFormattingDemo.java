package java_complete_labs_oracle;

import java.time.*;

public class DateTimeFormattingDemo {
    public static void main (String... arg){
        //Todo get date today
        LocalDate dateToday = LocalDate.now();
        System.out.println("Today date is "+dateToday);

        //Todo get the day of week after one year on same current date
        DayOfWeek day = dateToday.plusYears(1).getDayOfWeek();
        System.out.println("Day of same date after 1 year will be "+day);

        //Todo set the event time(hours,min,sec,nanosec)
        LocalTime teaTime = LocalTime.of(17,30);
        System.out.println("My Tea Time is "+teaTime);

        //Todo get the gap b/w current time & event time(can be in positive or negative)
        Duration timeGape = Duration.between(LocalTime.now(),teaTime);
        System.out.println("Time left in my tea time is "+timeGape);

        //Todo get days fractional part left in any event (teaTime)
        long timeGapeDaysPart = timeGape.toDaysPart();
        System.out.println("Days part left in tea time is "+timeGapeDaysPart);

        //Todo get hours part left in any event (teaTime)
        int timeGapeHoursPart = timeGape.toHoursPart();
        System.out.println("Hours part left in tea time is "+timeGapeHoursPart);

        //Todo get mins part left in any event (teaTime)
        int timeGapeMinPart = timeGape.toMinutesPart();
        System.out.println("Minutes part left in tea time is "+timeGapeMinPart);

        //Todo get seconds part left in any event (teaTime)
        int timeGapeSecPart = timeGape.toSecondsPart();
        System.out.println("Seconds part left in tea time is "+timeGapeSecPart);

        //Todo get nano seconds part left in any event (teaTime)
        int timeGapeNanoSecPart = timeGape.toNanosPart();
        System.out.println("Nano Seconds part left in tea time is "+timeGapeNanoSecPart);

        //Todo get days left in any event (teaTime)
        Long timeGapeDays = timeGape.toDays();
        System.out.println("Days left in tea time is "+timeGapeDays);

        //Todo get hours left in any event (teaTime)
        Long timeGapeHours = timeGape.toHours();
        System.out.println("Hours left in tea time is "+timeGapeHours);

        //Todo get mins left in any event (teaTime)
        Long timeGapeMin = timeGape.toMinutes();
        System.out.println("Minutes left in tea time is "+timeGapeMin);

        //Todo get seconds left in any event (teaTime)
        Long timeGapeSec = timeGape.toSeconds();
        System.out.println("Seconds left in tea time is "+timeGapeSec);

        //Todo set any event (tea time) on any data not just today
        LocalDateTime tomorrowTeaTime = LocalDateTime
                .of(dateToday.plusDays(1),teaTime);
        System.out.println("Tomorrow my tea time is "+tomorrowTeaTime);

        //Todo Calculate time left in event on any day
        Duration timeLeftInTomorrowTeaTime = Duration
                .between(LocalDateTime.now(),tomorrowTeaTime);
        System.out.println("Time left in tomorrow tea is "+timeLeftInTomorrowTeaTime);

        //Todo
    }
}
