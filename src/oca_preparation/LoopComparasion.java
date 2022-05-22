package oca_preparation;

public class LoopComparasion {
    public static void main (String ... arg){

        // 1 3 5
        for (int i=0; i < 5; i++){
            System.out.print("\t"+(++i));
        }
        System.out.println();
        // 1 3 5
        int i = 0;
        while (i<5){
            System.out.print("\t"+(++i));
            ++i;
        }
//        // 2 4 6
//        int i = 0;
//        while (i<5){
//            i++;
//            System.out.print("\t"+(++i));
//        }
        //error
//        for (int i=0; i < 5;){
//            System.out.print("\t"+(++i++));
//        }
//        // unstop able
//        for (int i=0; ; i++){
//            if (i<5)
//                continue;
//            System.out.println(++i);
//        }

    }
}
