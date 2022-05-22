package java_complete_reference.introducing_classes;

public class Factorials {
    //create a recursive method
    int fact(int n){
        int result;

        if (n==1) return 1;// b/c 1 is last factorial of every num
        result = fact(n - 1) * n;// if n is not 1 then invoke method but sub 1 from n and multiply it with n
        return result;
    }
}
