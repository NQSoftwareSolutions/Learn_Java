package java_complete_labs_oracle;

public class StringBuilderDemo {
    public static void main(String... arg){
        String s = "Tea Tea";
        StringBuilder builder = new StringBuilder(s);

        //TODO get length of java_complete_reference.string builder object
        System.out.println("Length of String builder object is "+builder.length());

        //TODO get the capacity of String builder object
        System.out.println("Capacity of java_complete_reference.string builder object is "+builder.capacity());

        //Todo replace the first world with "What is the price of"
        builder.replace(0,3,"What is the price of");
        System.out.println(builder);

        //TODO get length of java_complete_reference.string builder object
        System.out.println("Length of String builder object is "+builder.length());

        //TODO get the capacity of String builder object
        System.out.println("Capacity of java_complete_reference.string builder object is "+builder.capacity());
    }
}
