package java_complete_reference.date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MethodDefinitions {
    public static String suffix(int number){
        String sn = String.valueOf(number);//get number and convert it into java_complete_reference.string
        char c = sn.charAt(sn.length()-1),//get last character of java_complete_reference.string
                c2 = sn.charAt(sn.length()-2);//get second last character or java_complete_reference.string
        String s,
                s2n = String.valueOf(c) + c2;//concat both characters
        int num = Integer.parseInt(s2n);//change java_complete_reference.string s2n to int
        sn = String.valueOf(c);//convert char to java_complete_reference.string
        number = Integer.parseInt(sn);//convert java_complete_reference.string to int
        switch (number){
            case 1:
                if (num > 10 || num < 21) {
                    s = "th";
                }else { s = "st";}
                break;
            case 2:
                if (num > 10 || num < 21) {
                    s = "th";
                }else { s = "nd";};
                break;
            case 3:
                if (num > 10 || num < 21) {
                    s = "th";
                }else { s = "rd";};
                break;
            default: s = "th";break;
        }
        return s;
    }
    public static LocalTime currentTime() {
        String clockSection = cs();
        System.out.print("Current Time is : "+LocalTime.now()+" "+clockSection);
        return LocalTime.now();
    }
    public static String cs(){
        DateTimeFormatter ap = DateTimeFormatter.ofPattern("a");
        return ZonedDateTime.now().format(ap);
    }
    public static String clockSection(){
        DateTimeFormatter ap = DateTimeFormatter.ofPattern("a");
        System.out.println("Current clock section is "+ ZonedDateTime.now().format(ap));
        return ZonedDateTime.now().format(ap);
    }
    public static int clockOfSection(){
        // return 1 - 12 clocks
        DateTimeFormatter cs = DateTimeFormatter.ofPattern("h");
        System.out.println("Clock of current section is "+ ZonedDateTime.now().format(cs));
        return Integer.parseInt(ZonedDateTime.now().format(cs));
    }
    public static int hourOfSection(){
        // return 0 - 11 hours
        DateTimeFormatter hs = DateTimeFormatter.ofPattern("K");
        System.out.println("Hour of this section is "+ZonedDateTime.now().format(hs));
        return Integer.parseInt(ZonedDateTime.now().format(hs));
    }
    public static int clockHour24HTime(){
        DateTimeFormatter ch24 = DateTimeFormatter.ofPattern("k");
        System.out.println("Current clock of 24 hours time is "+ZonedDateTime.now().format(ch24));
        return Integer.parseInt(ZonedDateTime.now().format(ch24));
    }
    public static int hourOfDay(){
        //return 0-23 hour
        DateTimeFormatter hd = DateTimeFormatter.ofPattern("H");
        System.out.println("Hour of current day is "+ ZonedDateTime.now().format(hd));
        return Integer.parseInt(ZonedDateTime.now().format(hd));
    }
    public static int passMinOfHour(){
        DateTimeFormatter mh = DateTimeFormatter.ofPattern("m");
        System.out.println(ZonedDateTime.now().format(mh)+" Minutes are passed in this hour.");
        return Integer.parseInt(ZonedDateTime.now().format(mh));
    }
    public static int leftMinOfHour(){
        DateTimeFormatter lmh = DateTimeFormatter.ofPattern("m");
        int totMin = 60, passedMin = Integer.parseInt(ZonedDateTime.now().format(lmh));
        int leftMin = totMin - passedMin;
        System.out.println(leftMin+" Minutes are left in this hour.");
        return leftMin;
    }
    public static int leftSecOfHour(){
        DateTimeFormatter lsh = DateTimeFormatter.ofPattern("m");
        int totSec = 60*60,
                passedSec = Integer.parseInt(ZonedDateTime.now().format(lsh))*60,
                leftSec = totSec - passedSec;
        System.out.println(leftSec + " Seconds are left in this hour.");
        return leftSec;
    }
    public static int passedSecOfHour(){
        DateTimeFormatter psh = DateTimeFormatter.ofPattern("m");
        int passSec = Integer.parseInt(ZonedDateTime.now().format(psh)) * 60;
        System.out.println(passSec+" seconds are passed in this hour.");
        return passSec;
    }
    public static int passedMilliSecOfHour(){
        DateTimeFormatter pmsh = DateTimeFormatter.ofPattern("m");
        int sec = 60,
                milliSec = 100,
                passedMilliSec = Integer.parseInt(ZonedDateTime.now().format(pmsh))*sec*milliSec;
        System.out.println(passedMilliSec+" milli seconds are passed in this hour.");
        return passedMilliSec;
    }
    public static int leftMilliSecOfHour(){
        DateTimeFormatter lmsh = DateTimeFormatter.ofPattern("m");
        int min = 60,
                sec = 60,
                milliSec = 100,
                totMilliSec = min * sec * milliSec,
                passedMilliSec = Integer.parseInt(ZonedDateTime.now().format(lmsh)) * sec * milliSec,
                leftMilliSec = totMilliSec - passedMilliSec;
        System.out.println(leftMilliSec +" milli seconds are left in this hour");
        return leftMilliSec;
    }
    public static int passedSecOfMin(){
        DateTimeFormatter psm = DateTimeFormatter.ofPattern("s");
        System.out.println(ZonedDateTime.now().format(psm)+" seconds are passed in this minute.");
        return Integer.parseInt(ZonedDateTime.now().format(psm));
    }
    public static int leftSecOfMin(){
        DateTimeFormatter lsm = DateTimeFormatter.ofPattern("s");
        int totSec = 60,
                passedSec = Integer.parseInt(ZonedDateTime.now().format(lsm)),
                leftSec = totSec - passedSec;
        System.out.println(leftSec+" Seconds are left in this minute.");
        return leftSec;
    }
    public static int fractionOfSec(){
        DateTimeFormatter fs = DateTimeFormatter.ofPattern("S");
        System.out.println(ZonedDateTime.now().format(fs)+" fraction of seconds are passed.");
        return Integer.parseInt(ZonedDateTime.now().format(fs));
    }
    public static int passedNanoOfSec(){
        DateTimeFormatter pns = DateTimeFormatter.ofPattern("n");
        System.out.println(ZonedDateTime.now().format(pns)+" nano seconds are passed of this second.");
        return Integer.parseInt(ZonedDateTime.now().format(pns));
    }
    public static int leftNanoOfSec(){
        DateTimeFormatter lns = DateTimeFormatter.ofPattern("n");
        int totNanoSec = 1000000000,
                passedNanoSec = Integer.parseInt(ZonedDateTime.now().format(lns)),
                leftNanoSec = totNanoSec - passedNanoSec;
        System.out.println(leftNanoSec+" nano seconds are left in this second.");
        return leftNanoSec;
    }
    public static LocalDate currentDate () {
        LocalDate cd = LocalDate.now();
        System.out.println("Today Date is : "+cd);
        return cd;
    }
    public static LocalDate dateTimeSTDFormat(){
        //get current date with standard format with slashes
        DateTimeFormatter dtsf = DateTimeFormatter.ofPattern("dd/LL/yyyy");
        System.out.println("Standard date format with / : "+dtsf.format(LocalDate.now()));

        //parse a java_complete_reference.string to date using same format
        LocalDate.parse("04/10/1997",dtsf);
        //parse java_complete_reference.string into local date
        return LocalDate.parse(dtsf.format(LocalDate.now()));
    }
    public static LocalDateTime currentDateTime () {
        LocalDateTime cdt = LocalDateTime.now();
        System.out.println("Current Date & Time is : "+cdt);
        return cdt;
    }
    public static LocalTime myCurrentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss:a");
        System.out.println("Current time is "+ dtf.format(LocalTime.now()));
        return null;
    }
    public static LocalDateTime dateTimeNoZone(){
        //format a date and time with out time zone info
        DateTimeFormatter tz = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm:ss a");
        System.out.println("Time with out time zone : "+ZonedDateTime.now().format(tz));
        //String parse into local time and date
        return LocalDateTime.parse(ZonedDateTime.now().format(tz));
    }
    public static LocalDateTime dateTimeWithZone(){
        //format a date and time with time zone info
        DateTimeFormatter nTZ = DateTimeFormatter.ofPattern("z d MMMM, yyyy h:mm:ss a");
        System.out.println("Time with time zone : "+ZonedDateTime.now().format(nTZ));
        return LocalDateTime.parse(ZonedDateTime.now().format(nTZ));
    }
    public static int passedMilliSecOfDay(){
        DateTimeFormatter pmd = DateTimeFormatter.ofPattern("A");
        System.out.println(ZonedDateTime.now().format(pmd)+" milli seconds are passed of this day.");
        return Integer.parseInt(ZonedDateTime.now().format(pmd));
    }
    public static Double passedNanoSecOfDay(){
        DateTimeFormatter pnsd = DateTimeFormatter.ofPattern("N");
        System.out.println(ZonedDateTime.now().format(pnsd)+
                " nano seconds of this day are passed.");
        return Double.parseDouble(ZonedDateTime.now().format(pnsd));
    }
    public static int dayOfWeek(){
        DateTimeFormatter wy = DateTimeFormatter.ofPattern("e");
        //get java_complete_reference.string  and convert it to int b/c DTF not returning expected day ..
        int d = Integer.parseInt(ZonedDateTime.now().format(wy))-1;
        String s = String.valueOf(d);
        s = "10"+s;
        int i = Integer.parseInt(s);
        System.out.println("Today is "+d+suffix(i)+" day of week.");
        return d;
    }
    public static String dayOfWeek2(){
        DateTimeFormatter dy = DateTimeFormatter.ofPattern("EEEE");
        System.out.println("Today is "+ZonedDateTime.now().format(dy));
        return ZonedDateTime.now().format(dy);
    }
    public static String month(){
        int month = my();
        String m = String.valueOf(month);
        switch (month){
            case 1: m = "January";break;
            case 2: m = "February";break;
            case 3: m = "March";break;
            case 4: m = "April";break;
            case 5: m = "May";break;
            case 6: m = "June";break;
            case 7: m = "July";break;
            case 8: m = "August";break;
            case 9: m = "September";break;
            case 10: m = "October";break;
            case 11: m = "November";break;
            default: m = "December";
        }
        return m;
    }
    public static String dayOfMonth(){
        DateTimeFormatter dm = DateTimeFormatter.ofPattern("d");
        System.out.println("Today is "+ZonedDateTime.now().format(dm)
                +suffix(Integer.parseInt(ZonedDateTime.now().format(dm)))+" day of this month");
        return ZonedDateTime.now().format(dm);
    }
    public static int daysLeftInMonth(){
        int days = Integer.parseInt(dayOfMonth());
        System.out.println(days);
        return 0;
    }
    public static String weekOfMonth(){
        DateTimeFormatter wm = DateTimeFormatter.ofPattern("W");
        String week = ZonedDateTime.now().format(wm);
        String suffix =suffix(Integer.parseInt(week));
        System.out.println("This is "+week+suffix+" week of this month.");
        return week;
    }
    public static int weeksInMonth(){
        DateTimeFormatter wInm = DateTimeFormatter.ofPattern("F");
        int weeks = Integer.parseInt(ZonedDateTime.now().format(wInm)) -1;
        System.out.println("Weeks in this month are "+weeks);
        return weeks;
    }
    public static int dayOfYear(){
        DateTimeFormatter dy = DateTimeFormatter.ofPattern("D");
        System.out.println("Today is "+ZonedDateTime.now().format(dy)
                +suffix(Integer.parseInt(ZonedDateTime.now().format(dy)))+" day of this year.");
        return Integer.parseInt(ZonedDateTime.now().format(dy));
    }
    public static int weekOfYear (){
        DateTimeFormatter wy = DateTimeFormatter.ofPattern("w");
        System.out.println("This week is "+ZonedDateTime.now().format(wy)
                +suffix(Integer.parseInt(ZonedDateTime.now().format(wy)))+" week of this year.");
        return Integer.parseInt(ZonedDateTime.now().format(wy));
    }
    public static int my(){
        DateTimeFormatter my = DateTimeFormatter.ofPattern("M");
        return Integer.parseInt(ZonedDateTime.now().format(my));
    }
    public static int monthOfYear(){
        DateTimeFormatter my = DateTimeFormatter.ofPattern("M");
        System.out.println("This month is "+ZonedDateTime.now().format(my)
                +suffix(Integer.parseInt(ZonedDateTime.now().format(my)))+"  of this year");
        return Integer.parseInt(ZonedDateTime.now().format(my));
    }
    public static int quarterOfYear(){
        DateTimeFormatter qy = DateTimeFormatter.ofPattern("Q");
        System.out.println("This is "+ZonedDateTime.now().format(qy)
                +suffix(Integer.parseInt(ZonedDateTime.now().format(qy)))+" Quarter of this Year");
        return Integer.parseInt(ZonedDateTime.now().format(qy));
    }
    public static String era(){
        DateTimeFormatter era = DateTimeFormatter.ofPattern("G");
        System.out.println("This era is "+ZonedDateTime.now().format(era));
        return ZonedDateTime.now().format(era);
    }
    public static int yearOfEra(){
        DateTimeFormatter ye = DateTimeFormatter.ofPattern("y");
        System.out.println("This is "+ZonedDateTime.now().format(ye)
                +suffix(Integer.parseInt(ZonedDateTime.now().format(ye)))+" year of this era.");
        return Integer.parseInt(ZonedDateTime.now().format(ye));
    }
    public static int yearOfEra2(){
        DateTimeFormatter ye = DateTimeFormatter.ofPattern("u");
        System.out.println("This is "+ZonedDateTime.now().format(ye)
                +suffix(Integer.parseInt(ZonedDateTime.now().format(ye)))+" year of this era");
        return Integer.parseInt(ZonedDateTime.now().format(ye));
    }

    //Some Method which not working as expected
    public static void weeksInYear (){
        DateTimeFormatter wINy = DateTimeFormatter.ofPattern("w");
        System.out.println("weeks in this year are "+ZonedDateTime.now().format(wINy));
    }
    public static int leftMilliSecInDay(){
        DateTimeFormatter lmsd = DateTimeFormatter.ofPattern("A");

        return 0;
    }
}
