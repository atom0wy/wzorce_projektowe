package wzorce_projektowe.decorator;

public class AbsCar extends CarDecorator{

    public AbsCar(Vehicle decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void drive() {
        System.out.println("car with abs");
    }

    @Override
    public String description() {
        return decoratedCar.description() + ", z ABS";
    }
}