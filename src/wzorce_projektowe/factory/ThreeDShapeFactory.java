package wzorce_projektowe.factory;

public class ThreeDShapeFactory extends AbstractFactory {
    @Override
    public GeometricShape getShape(ShapeType shapeType) {
        if (ShapeType.SPHERE == shapeType) {
            return new Sphere();
        }
        return null;
    }
}