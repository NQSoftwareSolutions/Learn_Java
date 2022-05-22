package java_complete_reference.introducing_classes;

public class Recursion {
    int num;
    int[] values;

    Recursion(int i){
        num = i;
        values = new int[i];
    }

    // display array recursively
    void printArray(int i){
        if (i==0) return;
        else printArray(i -1);
        System.out.println("[ " +(i-1)+" ] "+ values[i-1]);
    }
}
