package java_complete_reference.string;

import java.util.Stack;
import java.util.StringTokenizer;

public class MethodDefinition {
    public void evoluteString(String string){
        /*
        This method will provide some info about provided java_complete_reference.string
         */
        String a = string;
        for(int i = 0; i < a.length(); i++){
            System.out.println("Index No : "+i+" Character is : "+a.charAt(i));
        }
        System.out.println("Total characters in java_complete_reference.string are : "+a.length());
    }
    public void reverseStringChar(String string){
        /*
        This method will reverse the chars of a java_complete_reference.string
         */
        String s = string;
        //use String Builder reverse method
        System.out.println(s +" : After Reversing : "+ new StringBuilder(s).reverse());
    }
    public void reverseStringWord(String string){
        /*
        This method will reverse the provided String
         */
        String s = string;
        //Create Stack Object
        Stack<String> myStringStack = new Stack<>();
        //Create String Tokenizer object
        StringTokenizer stringTokenizer = new StringTokenizer(s);
        //Push whole String into Stack
        while(stringTokenizer.hasMoreTokens()){
            myStringStack.push(stringTokenizer.nextToken());
        }
        //Pop The Stack elements
        System.out.println('"' + s + '"' + " Reverse word by word : \n\t\"");
        while (!myStringStack.empty()){
            System.out.println(myStringStack.pop());
            System.out.println();
        }
    }
    public void stringToUpperCase(String string){
        /*
        this method will change java_complete_reference.string to upper case
         */
        String s = string;
        System.out.println(s+" \"After Conversion \" "+s.toUpperCase());
    }
    public void stringToLowerCase(String string){
        /*
        This method will change java_complete_reference.string to lower case
         */
        String s = string;
        System.out.println(s+" \"After Conversion \" "+s.toLowerCase());
    }
    public void compareStringIgnoreCase(String string1,String string2){
        /*
        This method will compare two String with out comparing case
         */
        String s1 = string1,s2 = string2;
        boolean check = s1.equalsIgnoreCase(s2);
        System.out.println(s1+" is equals to "+s2+ " is : "+check);
    }
}
