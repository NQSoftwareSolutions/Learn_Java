package java_complete_reference.operators;

class LeftShift {
    public static void main (String ... arg){
        byte a = 64,b;
        int i;
        char c;

        i = a << 10;
        b =(byte) (a << 10);//casting to byte will discard it's higher 3 bytes
        c = (char) (a << 10);
        int ci = c;

        System.out.println(
                "           Original value of a : "+a+"\n" +
                "           Integer shift value : "+i+"\n" +
                "Byte shift value after casting : "+b+"\n" +
                "Char shift value after casting : "+c+"\n" +
                "              char c dec value : "+ci);
    }
}
