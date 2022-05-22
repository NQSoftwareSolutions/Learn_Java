package java_complete_reference.regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    //Documentation for Understanding
    //Regular Expression:
    /*
    * java.util.regex is java.base model
    * Regular expressions is String of characters that describes a character sequence known as pattern..
    * There are two main classes which support regex processing are Pattern & Matcher.
    */
    //Todo Pattern:
    /*
    * Pattern used to define a Regex..
    * Matcher used to Match that pattern to an other sequence..
    * Pattern class defines no constructor..
    * Pattern class created by calling the Compile() (A factory method)
    * eg..static Pattern compile(String pattern)
    * compile() method transform java_complete_reference.string into Pattern which used by matcher class for pattern matching
    * compile() return a pattern object which contains pattern
    * Once pattern object is created then we will use it to create matcher ..by calling matcher method.
    * eg..Matcher matcher(CharSequence java_complete_reference.string)
    * java_complete_reference.string in matcher method is CharSequence that the pattern will match against..known as input sequence.
    * CharSequence is Interface that defines a read only set of characters, implemented by String class..
    */
    //Todo Matcher:
    /*
    * Matcher class has no constructor..
    * we can Matcher by calling matcher() factory method defines by pattern..
    * Simplest pattern matching method is matches()..which determines CharSequence matches the pattern
    * eg .. boolean matches().. return true if CharSequence and pattern matches else false..
    * find() used to check charSeq is matching with pattern or not..
    * eg ... boolean find()..we can call it repeatedly for every seq..
    * find() will get all occurrences of seq but 1st occurrence should be starting of work other occurrences can get from middle of word
    * group() used to obtain java_complete_reference.string containing last matching seq..
    * eg .. String group()..can through IllegalStateException ..if no match exists..
    * we can find start index no IN charSeq by start() and end by end()..
    * eg..int start() ..&.. int end()..both through IllegalStateException ..if no match exists..
    * we replace all matching sequences by replaceAl ()..
    * eg .. String replaceAll(String newSeq..)..newSeq will replace the all charSeq which match the pattern..
    */
    //Regular Expression Syntax:
    /*
    * regex is comprised of normal characters, character classes(sets of chars),wildcard chars, and quantifiers..
    * character in Regex language known as literal.
    * \n ... represent new line char
    * \t ... ......... tab char
    * A character class is a set characters specified by putting the characters in the class b/w brackets[]
    * eg .. [abcd]..matches ..a,b,c,d..respectively for all class members.
    * we can also specify invert set by [^...] means except these chars set
    * eg .. [^abcd].. matches except a,b,c,d...
    * we can specify range of char by hyphen[0-9]..
    * eg ..[0-9] .. matches the digits from 0 to 9..
    * dot "." is a wildcard character ..it matches any character.. and specified char also.
    * A quantifier determines how many times an expression is matches ..
    * eg.. (w+)provide one or more arbitrarily sequence Ws..
    * eg.. (w*)provide one or more arbitrarily sequence Ws..
    * eg.. (w?)provide one or more arbitrarily sequence Ws..
    * eg.. "X+" will match "X" , "XX", "XXX","X..n"
    * eg.. "X*" will match "" , "X", "XXX","X..n"
    * eg.. "X?" will match "","X"
    * PatternSyntaxException will thrown if we provide any of wrong pattern.
    */
    public boolean literalRegex(String patternString, String matcherString){
        Pattern pattern;//pattern obj
        Matcher matcher;//matcher obj
        Boolean found;//found var..
        pattern = Pattern.compile(patternString);//set pattern
        matcher = pattern.matcher(matcherString);//set matcher which i have to match
        found = matcher.matches();//check char seq.. is matched or not..
        System.out.println("Testing "+patternString+" Against "+matcherString);
        if (found)System.out.println("Matched");
            else System.out.println("Not Matched");
        return found;
    }
    public boolean findSequence(String patternString, String matcherStringSeq){
        boolean find;
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherStringSeq);
        System.out.println("Looking for \""+patternString+"\" in \""+matcherStringSeq+"\"");
        find = matcher.find();
        if (find) System.out.println("\""+patternString+"\" Sequence Found in \""+matcherStringSeq+"\"");
            else System.out.println("\""+patternString+"\" Sequence not Found in \""+matcherStringSeq+"\"");
        return find;
    }
    public boolean findMultipleSeqs(String patternString, String matcherStringSeq){
        boolean find;
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherStringSeq);
        find = matcher.find();
        while (matcher.find())
            System.out.println(patternString+" is found at index "+matcher.start());//Start method will obtain index number..
        return find;
    }
    public boolean quantifierPlus(String patternString, String matcherString){
        boolean find;
        Pattern pattern = Pattern.compile(patternString.concat("+"));
        Matcher matcher = pattern.matcher(matcherString);
        while (matcher.find()) {
            System.out.println("Match : "+ matcher.start());
        }
        find = matcher.find();
        return find;
    }
    public boolean findWords(String startChar,String endChar, String stringParagraph){
        boolean find;
        Pattern pattern = Pattern.compile(startChar.concat(".+?"+endChar));//here iam defined start and end character and for middle characters iam using wild card
        Matcher matcher = pattern.matcher(stringParagraph);
        while (matcher.find()) System.out.println(matcher.group());
        find = matcher.find();
        return find;
    }
    public boolean findAlphabeticalWords(String stringSeq){
        boolean find;
        Pattern pattern = Pattern.compile("[a-z,A-Z]+");
        Matcher matcher = pattern.matcher(stringSeq);
        while (matcher.find())
            System.out.println(matcher.group());
        find = matcher.find();
        return find;
    }
    public boolean replaceWords(String findWord,String replaceWord,String paragraph){
        boolean find;
        Pattern pattern = Pattern.compile(findWord);//word which we want to replace
        Matcher matcher = pattern.matcher(paragraph);//paragraph in which we have to search that word
        System.out.println("Original Paragraph : \n"+paragraph);
        paragraph = matcher.replaceAll(replaceWord);//word which will replace
        System.out.println("New Paragraph : \n"+paragraph);
        return matcher.find();
    }
    public boolean replaceByStartWord(String startString,String replaceString, String paragraph){
        boolean find;
        Pattern pattern = Pattern.compile(" "+startString.concat(".*? "));// words which we have to replace
        Matcher matcher = pattern.matcher(paragraph);//paragraph in which we have look for matching pattern
        System.out.println("Original Paragraph:\n"+paragraph);
        paragraph = matcher.replaceAll(replaceString.concat(" "));//java_complete_reference.string which will replace all finds
        System.out.println("New Paragraph: \n"+paragraph);
        return matcher.find();
    }
    public void setParagraph(String paragraphs){
        Pattern pattern = Pattern.compile("[.]");
        String string[] = pattern.split(paragraphs);
        for (int i = 0; i < string.length; i++){
            System.out.println(string[i]);
        }
    }
    public boolean emailValidator(String email){
        Pattern pattern = Pattern.compile("[@]+");
        Matcher matcher = pattern.matcher(email);
        boolean find = matcher.find();
        System.out.println(find);
        return find;
    }
}
