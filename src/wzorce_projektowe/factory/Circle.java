package wzorce_projektowe.factory;

public class Circle implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
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
