package Package_3.FactoryMethod.baitap;

public class ShapeFactory {
    public static Shape getShape(ShapeType type){
        switch (type){
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("This Shape type is unknown!");
        }
    }
}
