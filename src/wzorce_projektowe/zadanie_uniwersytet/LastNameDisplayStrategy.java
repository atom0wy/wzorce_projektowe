package wzorce_projektowe.zadanie_uniwersytet;

import java.util.Comparator;
import java.util.List;

public class LastNameDisplayStrategy implements DisplayStrategy {

    @Override
    public void display(List<Person> personList) {
        personList.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .forEach(System.out::println);
    }
}