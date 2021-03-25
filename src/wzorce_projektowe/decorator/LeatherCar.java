package wzorce_projektowe.decorator;

public class LeatherCar extends CarDecorator{

    public LeatherCar(Vehicle decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void drive() {
        System.out.println("car teather drive");
    }

    @Override
    public String description() {
        return decoratedCar.description() + ", ze skórzanymi fotelami";
    }
}