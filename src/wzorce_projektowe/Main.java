package wzorce_projektowe;

import wzorce_projektowe.builder.Computer;
import wzorce_projektowe.builder.exercise.Pizza;
import wzorce_projektowe.factory.*;
import wzorce_projektowe.singleton.EagerSingleton;

public class Main {
    public static void main(String[] args) {
        //EagerSingleton eagerSingleton = new EagerSingleton();
        Computer computer = new Computer.ComputerBuilder("250 GD", "8 GB")
                .setUsbEnabled(true)
                .build();

        System.out.println(computer);

        Pizza peperoni = new Pizza.PizzaBuilder("salami", "grube", "algierski")
                .setCzyBiala(false)
                .setDodatkowaWielkosc(32)
                .build();

        System.out.println("\n" + peperoni);

        AbstractFactory factory = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
        GeometricShape geometricShape = factory.getShape(ShapeType.LINE);
        geometricShape.draw();
    }
}