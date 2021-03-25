package wzorce_projektowe.factory;

public class Trapezoid implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Trapezoid draw");
    }

    @Override
    public float calculateArea() {
        return 100;
    }

    @Override
    public float calculatePerimeter() {
        return 50;
    }
}