package java_complete_reference.introducing_classes;

public class AccessModifiers {
    int i; // access is null (Inside current pkg)
    public int j;// access is public (globally)
    private  int k; // access is private so it just use able inside in this class by instance variables

    public AccessModifiers(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
    }

    // create methods by which we can access to k b/c it will not access able outside this class

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }
    public int sum(int i1, int i2, int i3){
        return i1 + i2 + i3;
    }

}
