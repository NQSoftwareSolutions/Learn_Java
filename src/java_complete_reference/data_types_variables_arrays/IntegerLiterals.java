package java_complete_reference.data_types_variables_arrays;

class IntegerLiterals {
    public static void main (String ... arg){
        // demonstrate all uses of integer literal
        int i;

        i = 10;// assign int value in decimal numbers
        System.out.println("decimal : i is : "+i);

        System.out.println();
        i = 0x1ffffaf;// assign int value in hexadecimal numbers
        System.out.println("hex : i is : "+i);

        System.out.println();
        i = (int) 0xffff_ffff_ffffl;//ans will be in negative b/c value is bigger then size of int
                                    // assign hex long whole number to int and
                                    // cast & append by l it as int b/c value is large then its size
        System.out.println("long hex : i is : "+i);

        System.out.println();
        long j = 0xffff_ffff_ffffl;// declare and define long variable & assign above same int value
                                    // append by l it as int b/c java understand it as int
        System.out.println("long hex : i is : "+j);

        System.out.println();
        char c ;// declare character
        c = 10;// assign int number to char
        System.out.println("char : i is : "+c);

        System.out.println();
        i = 0b101;// assign int value in binary numbers
        System.out.println("binary : i is : "+i);

        System.out.println();
        i = 0b1101_0001_0010_1011;// assign int value in binary numbers
        System.out.println("binary underscore : i is : "+i);

        System.out.println();
        i = 1_000_000_000;// use of underscore in int value
        System.out.println("underscore : i is : "+ i);

        System.out.println();
        i = 1___000__000_000;// use of multiple underscore in int value
        System.out.println("multiple underscore : i is : "+ i);
    }
}
