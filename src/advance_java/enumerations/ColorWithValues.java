package advance_java.enumerations;

public enum ColorWithValues {
//    Todo Enum with internal values
    /**
     * Internal value are optional
     * Here Enums will work as place holders for internal values
     * The use case of internal values are a constant with a internal value,
     * constant will be visible to consumer and value will be used when
     * we call that enum constant.
     *
     * we can refer enum like (ColorWithValues.RED or any color)
     */
    RED("red"), GREEN("green"),
    BLACK("black");

    private String value;

    /**
     * @param value value of enum
     */
    ColorWithValues(String value) {
        this.value = value;
    }

//    Todo get internal value of enum
    /**
     * we will get value of enum by this method
     * @return value of enum
     */
    public String getValue() {
        return value;
    }
}
