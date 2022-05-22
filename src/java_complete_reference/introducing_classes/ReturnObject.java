package java_complete_reference.introducing_classes;

import javax.sound.midi.Soundbank;

public class ReturnObject {
    int a,b;

    public ReturnObject(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Sum is "+(a+b));
    }

    public ReturnObject rObject(int i, int j){
        ReturnObject obj = new ReturnObject(i,j);
        return obj;
    }
}
