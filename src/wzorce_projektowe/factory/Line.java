package wzorce_projektowe.factory;

/**
 * Concrete Product
 */
public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line draw");
    }

    @Override
    public float calculateArea() {
        return 0;
    }

    @Override
    public float calculatePerimeter() {
        return 0;
    }
}