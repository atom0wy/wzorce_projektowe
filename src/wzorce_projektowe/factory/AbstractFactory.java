package wzorce_projektowe.factory;

/**
 * Abstract factory
 */

public abstract class AbstractFactory {
    public abstract GeometricShape getShape(ShapeType shapeType);
}