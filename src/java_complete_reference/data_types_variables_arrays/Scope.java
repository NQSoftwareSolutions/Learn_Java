package java_complete_reference.data_types_variables_arrays;

public class Scope {
    public static void main (String ... arg){
        int x = 0; // Visible in whole main method

        if (x == 0){
            int y = 10;// this var will be visible to only in this block
            // both vars x and y are visible here(nested scope)
            System.out.println("values of x is "+x+
                    "\n value of y is "+y);
        }
        x = 10;//x is also visible here (check y)
        // check var y here
        //y = 100
        System.out.println("var x is "+x);

        for (x = 1; x < 10; x++){
            int y = 1; // this var will created by every iteration
            System.out.println("y is "+y);// it will always print 1

            y = 100;// we assign 100 to y but it will los by new iteration and will not print on consol
        }
    }
}
