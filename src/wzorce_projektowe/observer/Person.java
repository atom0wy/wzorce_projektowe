package wzorce_projektowe.observer;

public class Person extends Observer{
    @Override
    void update() {
        System.out.println("notify person");
    }
}