package factoryMethod;

public class ShapeFactory {


    public Shape getShape(String shapeType) {

        if (ShapeEnum.CIRCLE.getCode().equals(shapeType)) {
            return new Circle();
        } else if (ShapeEnum.RECTANGLE.getCode().equals(shapeType)) {
            return new Rectangle();
        } else if (ShapeEnum.SQUARE.getCode().equals(shapeType)) {
            return new Squre();
        } else {
            System.out.println("No shape specified");
            return null;
        }

    }

}
