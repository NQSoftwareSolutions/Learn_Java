package java_complete_reference.data_types_variables_arrays;

class BooleanTest {
    public static void main (String ... arg){
        boolean b; // declare boolean variable

        b = false;
        System.out.println("value of b is "+ b);
        b = true;
        System.out.println("Value of b is "+ b);

        // control if selection statement which we cover in upcoming lectures
        if (b = true) System.out.println("b is true");
        else System.out.println("b is false");

        //control iterative statements which we cover in upcoming lectures
        int i = 1;
        // this loop will print numbers 1 to 10
        while (b){
            System.out.println(i);
            if (i == 10) break;//break is jump statement we will cover it in upcoming lecture and
            i++;
        }
        b = false;
        int j = 1;
        // this loop will not run b/c b is false
        while (b){
            System.out.println(i);
            if (j == 10) break;//break is jump statement we will cover it in upcoming lecture and
            j++;
        }

    }
}
