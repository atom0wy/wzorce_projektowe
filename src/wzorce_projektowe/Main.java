package wzorce_projektowe;

import wzorce_projektowe.decorator.AbsCar;
import wzorce_projektowe.decorator.Car;
import wzorce_projektowe.decorator.LeatherCar;
import wzorce_projektowe.decorator.Vehicle;
import wzorce_projektowe.decorator.exercise.Internet;
import wzorce_projektowe.decorator.exercise.Media;
import wzorce_projektowe.decorator.exercise.Product;
import wzorce_projektowe.decorator.exercise.Television;
import wzorce_projektowe.zadanie_uniwersytet.Person;
import wzorce_projektowe.zadanie_uniwersytet.PersonFacade;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //EagerSingleton eagerSingleton = new EagerSingleton(); // nie da się utworzyć 2 instancji singletonu

        System.out.println("\nComputer Builder:");
        /*Computer computer = new Computer.ComputerBuilder("250 GD", "8 GB")
                .setUsbEnabled(true)
                .build();
        System.out.println(computer);*/

        System.out.println("\nPizza Builder:");
        /*Pizza peperoni = new Pizza.PizzaBuilder("salami", "grube", "algierski")
                .setCzyBiala(false)
                .setDodatkowaWielkosc(6)
                .setSize(Size.LARGE)
                .build();
        System.out.println("\n" + peperoni);*/

        System.out.println("\nAbstract Factory:");
        /*AbstractFactory factory = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
        GeometricShape geometricShape = factory.getShape(ShapeType.LINE);
        geometricShape.draw();*/

        System.out.println("\nLoggerEnum:");
        /*LoggerEnum loggerEnum = LoggerEnum.INSTANCE;
        LoggerEnum loggerEnum2 = LoggerEnum.INSTANCE;
        loggerEnum.log(LEVEL.INFO, "Testowy tekst");
        loggerEnum2.log(LEVEL.ERROR, "Testowy tekst 2");*/

        System.out.println("\nStrategy:");
        /*OperationContext operationContext = new OperationContext();
        String operator = "+";
        int x = 10;
        int y = 15;
        if ("+".equals(operator)) {
            operationContext.setOperationStrategy(new AddingStrategy());
        } else if ("*".equals(operator)) {
            operationContext.setOperationStrategy(new MultiplicationStrategy());
        }
        operationContext.mathematicalOperationCalculate(x,y);*/

        System.out.println("\nFacade:");
        /*PersonFacade personFacade = new PersonFacade();
        List<Person> personList = new LinkedList<>();

        personList.add(personFacade.addStudent("adam", "zabłocki", "java"));
        personList.add(personFacade.addTeacher("piotr", "nowak", List.of("wzorce", "spring")));

        personFacade.displayLastNameSorted(personList);*/

        System.out.println("\nAdapter:");
        /*// obiekt wejściowy
        Hdmi hdmi = new HdmiImpl();

        // obiekt wyjściowy (docelowy) - na nim chcemy pracować
        Usb usb = new Usb();

        // obiekt przejciowy (adapter/konwerter)
        HdmiToUsb hdmiToUsb = new HdmiToUsbAdapter(hdmi);

        // wywołujemy metody z obiektu docelowego
        usb.connect(hdmiToUsb);

        *//* ------ *//*

        Converter converter =  new TxtConverter();
        Pdf pdf = new Pdf();
        Adapter adapter = new AdapterImpl(converter);
        pdf.convert(adapter);*/

        System.out.println("\nDecorator exercise CAR:");
        /*//Vehicle vehicle = new Car();
        //Vehicle vehicleLeather = new LeatherCar(vehicle);
        //Vehicle vehicleLeatherWithAbs = new AbsCar(vehicleLeather);

        //lepszy sposób:
        Vehicle vehicle = new AbsCar((new LeatherCar((new Car()))));*/

        System.out.println("\nDecorator exercise MEDIA:");
        /*Product product = new Internet(new Television(new Media()));
        System.out.println(product.description());*/

        System.out.println("\nUniversity exercise:");
        PersonFacade personFacade = new PersonFacade();
        List<Person> personList = new LinkedList<>();

        personList.add(personFacade.addStudent("Adam", "Zabłocki", "java"));
        personList.add(personFacade.addTeacher("Piotr", "Nowak", List.of("wzorce", "spring")));

        System.out.println("Display first name:");
        personFacade.displayFirstNameSorted(personList);
        System.out.println("Display last name:");
        personFacade.displayLastNameSorted(personList);
    }
}