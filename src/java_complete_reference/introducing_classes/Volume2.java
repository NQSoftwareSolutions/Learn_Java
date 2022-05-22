package java_complete_reference.introducing_classes;

class Volume2 {
    public  static  void main (String ... arg){
        //Structure of volume class after method
        Box box = new Box();
        System.out.println("Box 1 volume is "+box.volume(12,23,23));

        Box box1 = new Box();
        System.out.println("Box 2 volume is "+ box1.volume(24,45,34));
    }
}
