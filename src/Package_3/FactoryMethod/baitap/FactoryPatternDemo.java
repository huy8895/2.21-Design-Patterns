package Package_3.FactoryMethod.baitap;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
        shape.draw();
    }
}
