package java_complete_reference.string;

public class StringDemo {
    public static void main (String ... arg){
        // create String reference var which can be changed any time
        String s = "AbdulQayoom", s2 = "ABDULQAYOOM";

        //compare two strings with out ignoring case
        Boolean compare = s.equals(s2);
        System.out.println(s +" equals not ignoring case with " + s2 +" is "+compare);

        //compare two strings with ignoring case
        compare = s.equalsIgnoreCase(s2);
        System.out.println(s +" equals ignoring case with " + s2 +" is "+compare);

        // create a substring
        String s3 = s.substring(5,s.length());// we can also specify index hardcoded
        System.out.println("substring is "+s3);

        // concat two strings
        s3 = s.concat(s2);
        System.out.println("concatenation is "+s3);

        //change java_complete_reference.string to upper case
        s.toUpperCase();
        System.out.println("to upper case : "+s);

        // change java_complete_reference.string to lower case
        s.toLowerCase();
        System.out.println("to lower case : "+s);

    }
}
