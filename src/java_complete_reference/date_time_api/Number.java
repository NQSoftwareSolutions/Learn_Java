package java_complete_reference.date_time_api;

import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void stringToDouble(String string){
        String s = string;
        double result;
        try{
            result = Double.parseDouble(s);
            System.out.println("java_complete_reference.date_time_api.Number is : "+result);
            return;
        }
        catch (NumberFormatException numberFormatException){
            System.out.println("Invalid java_complete_reference.date_time_api.Number : "+numberFormatException);
        }
    }
    public static void stringNumberOpt(String string1,String string2){
        String s1 = string1,s2 = string2;
        double r1,r2;
        double result;
        try{
            /*
            We can not apply any mathematical operations directly on java_complete_reference.string...
            so Iam going convert each of java_complete_reference.string to double and the applying operations on them
             */
            //Addition
             r1 = Double.parseDouble(s1);
             r2 = Double.parseDouble(s2);
             result = r1 + r2;
            System.out.println("Addition of "+r1+" & "+r2+" : "+result);
            //Sub
            r1 = Double.parseDouble(s1);
            r2 = Double.parseDouble(s2);
            result = r1 - r2;
            System.out.println("Sub of "+r2+" from "+r1+" : "+result);
            //Multiplication
            result = r1 * r2;
            System.out.println("Multiplication of "+s1+" & "+s2+" : "+result);
            //Division
            result = r1 / r2;
            System.out.println("Division of "+s1+" with "+s2+" : "+result);
            return;
        }
        catch (NumberFormatException numberFormatException){
            System.out.println("Invalid java_complete_reference.date_time_api.Number : "+numberFormatException);
        }
    }
    public static String suffix(int number){
        int n = number;
        String s;
        String sn = String.valueOf(n);
        char c = sn.charAt(sn.length()-1);
        String s2 = sn.substring(sn.length()-3,sn.length()-1);
        int s2n =Integer.parseInt(s2);
        System.out.println(s2n);
        sn = String.valueOf(c);
        n = Integer.parseInt(sn);
        switch (n){
            case 1:
                if (s2n == 11 || s2n == 12 || s2n == 13 || s2n == 14 || s2n == 15 || s2n == 16
                        || s2n == 17 || s2n == 18 || s2n == 19){
                    s = "th";
                }else { s = "st";}
                break;
            case 2: s = "nd";break;
            case 3: s = "rd";break;
            default: s = "th";break;
        }
        return s;
    }
    public static void numberFormat(double number){
        //Covert number it into String
        String nString = String.valueOf(number);
        int length = nString.length() + 1;
        // Divide java_complete_reference.string to parts min 3 characters in java_complete_reference.string

        //Concatenate all but provide comma ","
        // after every number and also add dot ".00" at end of every java_complete_reference.string .
    }
    public static void guessingGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Well come to Wonderland");
        System.out.print("What is You Name : ");

        String name = scanner.next();
        System.out.println("Well come dear "+name);
        System.out.print("Shall we start game say! (yes or no) : ");

        String permission = scanner.next();
        //TODO: get permission until yes
        while (permission.equals("no")){
            System.out.print("Start game say! (yes or no) : ");
            permission = scanner.next();
        }
        //TODO: Get a random number b/w 0 to 20
        Random random = new Random();
        int number = random.nextInt(20)+1;
        System.out.println("Please guess a number : ");
        int guess = random.nextInt();
        //TODO: some variables
        int timesTried = -1;
        boolean hasWon = false;
        boolean shouldFinish = false;
        //TODO: loop for getting input until 5 tries
        while (!shouldFinish){
            timesTried++;
            if (timesTried < 5){
                if (guess == number){
                    hasWon = true;
                    shouldFinish = true;
                }else if(guess > number){
                    System.out.println("java_complete_reference.date_time_api.Number is lower");
                    guess = scanner.nextInt();
                }else{
                    System.out.println("java_complete_reference.date_time_api.Number is higher");
                    guess = scanner.nextInt();
                }
            }else {
                shouldFinish = true;
            }
        }
        if (hasWon){
            System.out.println("Congratulations you won! You have guessed in you "+timesTried+" tries");
        }else {
            System.out.println("Game Over");
            System.out.println("The java_complete_reference.date_time_api.Number was "+number);
        }
    }

}
