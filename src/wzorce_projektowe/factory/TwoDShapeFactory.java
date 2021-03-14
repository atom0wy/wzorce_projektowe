package wzorce_projektowe.factory;

public class TwoDShapeFactory extends AbstractFactory {
    @Override
    public GeometricShape getShape(ShapeType shapeType) {
        if (ShapeType.CIRCLE == shapeType) {
            return new Circle();
        } else if (ShapeType.LINE == shapeType) {
            return new Line();
        } else if (ShapeType.SQUARE == shapeType) {
            return new Square();
        }
        return null;
    }
}