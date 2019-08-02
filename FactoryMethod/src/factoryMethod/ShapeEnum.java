package factoryMethod;

public enum ShapeEnum {

    CIRCLE("circle"),
    RECTANGLE("rectangle"),
    SQUARE("square");

    private String code;

    ShapeEnum(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
