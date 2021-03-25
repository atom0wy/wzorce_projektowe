package wzorce_projektowe.observer;

public class Animal extends Observer{
    @Override
    void update() {
        System.out.println("notify animal");
    }
}