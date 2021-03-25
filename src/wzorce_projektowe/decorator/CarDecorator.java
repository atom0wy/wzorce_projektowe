package wzorce_projektowe.decorator;

public abstract class CarDecorator implements Vehicle{
    protected Vehicle decoratedCar;

    public CarDecorator(Vehicle decoratedCar) {
        this.decoratedCar = decoratedCar;
    }
}