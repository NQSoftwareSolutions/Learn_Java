package java_complete_labs_oracle;

public class StringDemo {
    public static void main (String... arg) {
        //System.out.println(compareTwoStrings("Love","love"));
//        System.out.println(intern1());
//        System.out.println(intern2());
//        System.out.println(intern3());
//        System.out.println(getIndexString("hello to the world of java",10,'w'));
//        System.out.println(getIndexString("hello to the world of java",'w'));
//        System.out.println(toUpperCase("Hello my Love NIHA"));
//        System.out.println(toLowerCase("Hello my Love NIHA"));
        System.out.println(getIndexLast("Hello jaan",0,'j'));
        System.out.println(getIndexLast("Hello jaan",'j'));
    }

    private static String compareTwoStrings(String s1, String s2) {
        //Todo Compare two Strings
        boolean compare = s1 == s2;
        String s ;
        if (compare) s = s1 + " is equals to "+s2;
        else s = s1 + " is not equals to "+s2;
        return s;
    }
    private static String intern1(){
        //Todo Intern ();
        String s1 = "tea",s;
        String s2 = new String("tea");
        boolean compare = s2 == s1.intern();
        if (compare) s = s2 +" & s1.intern are same";
        else s = s2 +" & s1.intern are not same";
        return s;
    }
    private static String intern2(){
        //Todo Intern ();
        String s1 = "tea",s;
        String s2 = "tea";
        boolean compare = s2 == s1.intern();
        if (compare) s = s2 +" & s1.intern are same";
        else s = s2 +" & s1.intern are not same";
        return s;
    }
    private static String intern3(){
        //Todo Intern ();
        String s1 = "tea",s;
        String s2 = "tea";
        String s3 = s1.intern();

        boolean compare = s2 == s3;
        if (compare) s = s2 +" & s1.intern are same";
        else s = s2 +" & s1.intern are not same";
        return s;
    }
    public static String getIndexString(String string,int start, char character){
        //TODO get index of any char
        try{
            int i = string.indexOf(character,start);
            String s = "Index of "+character+" in "+string+" is "+i+" after "+start;
            return s;
        }catch (StringIndexOutOfBoundsException e){
            String s = e.toString();
            return s;
        }
        }
    public static String getIndexString(String string,char character){
        //TODO get index of any char
        try{
            int i = string.indexOf(character);
            String s = "Index of "+character+" in "+string+" is "+i;
            return s;
        }catch (StringIndexOutOfBoundsException e) {
            String s = e.toString();
            return s;
        }
    }
    public static String toUpperCase(String string){
        //TODO make uppercase to any java_complete_reference.string
        String s = string.toUpperCase();
        return s;
    }
    public static String toLowerCase(String string){
        //TODO make lower case to any of java_complete_reference.string
        String s = string.toLowerCase();
        return s;
    }
    public static String getIndexLast (String string,int start,char character){
        //TODO get index of chars from last
        int ind = string.lastIndexOf(character,start);
        String s =  "Index of "+character +" from last is "+ind+" after "+start;
        return s;
    }
    public static String getIndexLast (String string,char character){
        // TODO get index of any char
        int ind = string.lastIndexOf(character);
        String s =  "Index of "+character +" from last is "+ind;
        return s;
    }
}