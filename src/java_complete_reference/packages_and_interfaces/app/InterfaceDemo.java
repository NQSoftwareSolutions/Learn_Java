package java_complete_reference.packages_and_interfaces.app;

class InterfaceDemo implements java_complete_reference.packages_and_interfaces.data.InterfaceDemo {
    public static void main(String... arg){
        InterfaceDemo interfaceDemo = new InterfaceDemo();
        interfaceDemo.getName("Abdul Qayoom");
    }

    @Override
    public void getName(String name) {
        System.out.println(name);
    }
}
