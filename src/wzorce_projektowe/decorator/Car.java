package wzorce_projektowe.decorator;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("drive car");
    }

    @Override
    public String description() {
        return "Samochód";
    }
}