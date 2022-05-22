package advance_java.enumerations;

public class Main {
    public static void main(String[] args) {
        ColorWithValues c1 = ColorWithValues.RED;

        System.out.println("Red enum name is : " +c1.name());
        System.out.println("Red enum value is : " + c1.getValue());

        System.out.println("Color Enum values");
        for (ColorWithValues color : ColorWithValues.values()){
            System.out.print(color.getValue()+ "\t");
        }
        System.out.println();

        System.out.println("Day Enum have");
        for (Day day : Day.values()){
            System.out.print(day+ "\t");
        }
        System.out.println();

        System.out.println("Month Enum have");
        for (Month month : Month.values()){
            System.out.print(month+ "\t");
        }
        System.out.println();
    }
}
