package java_complete_labs_oracle;

public class CharsDemo {
    public static void main (String... arg){

        // Todo Ways to init chars
        char ch1 = 'a', ch2 = '\141', ch3 = '\u0061';
        System.out.print(ch1 +" : "+ ch2 +" : "+ch3);

        boolean isEven = (ch1 % 2 == 0);
        System.out.println("\nch1 is even : "+isEven);

        System.out.println();

        //Todo search letter in alphabet
        char letter = 'K',start = 'a',end = 'z';
        for (int i = start; i < end; i++){
            if (letter == i ) {
                System.out.println(letter + " is b/w " + start + " & " + end);
            }
        }

        System.out.println();

        // Todo Print small Alphabet
        char a = 'a', z = 'z';
        for (int i = a; i <= z; i++) System.out.print("\t"+a++);

        System.out.println();
        // Todo Print small Alphabet ASCII codes
        char s = 'a',e = 'z';
        for (int i = s; i <= e; i++) System.out.print("\t"+i);

        System.out.println();
        // Todo Print capital Alphabet
        char A = 'A', Z = 'Z';
        for (int i = A; i <= Z; i++) System.out.print("\t"+A++);

        System.out.println();
        // Todo Print capital Alphabet ASCII codes
        char c1 = 'A',c2 = 'Z';
        for (int i = c1; i <= c2; i++) System.out.print("\t"+i);

        //Todo Get distance b/w two chars
        char uA = 'A', lA = 'a';
        int distance = lA - uA;
        System.out.println("\nDistance b/w "+uA + " & "+ lA +" is "+distance);

        //Todo convert lower case to uppercase alphabet
        char lower = 'z';
        char upper = (char)(lower  - distance);
        System.out.println("lower case : "+lower+" & upper case is : "+upper);
    }
}
