package oca_preparation;

public class TestWhile {
    public static void main (String ... arg){
        int x = 0;
        while(x < 100){
            if(x%2 == 1){
                x++;
                System.out.print(x+"\t");
            }
            else if(x%2 == 0){
                x += 3;
                System.out.print(x+"\t");
            }
        }
    }
}
