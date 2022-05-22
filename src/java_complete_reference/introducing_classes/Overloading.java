package java_complete_reference.introducing_classes;

class Overloading {
    int num;
    Overloading(int i){
        num = i;
    }
    int m(int i){
        System.out.println("Method one executed i*i = "+i*i);
        return i*i;
    }
    double m(int i, double j){
        System.out.println("Method two i * j = "+ i * j);
        return i*j;
    }
    double m(int i,double j,int k){
        System.out.println("Method three i+j+k = "+(i+j+k));
        return i+j+k;
    }
}
// create class OverloadingTest