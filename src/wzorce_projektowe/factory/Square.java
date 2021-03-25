package wzorce_projektowe.factory;

public class Square implements GeometricShape{
    @Override
    public void draw() {
        System.out.println("Square draw");
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