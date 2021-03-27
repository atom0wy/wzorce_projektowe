package wzorce_projektowe.zadanie_uniwersytet;

import java.util.Comparator;
import java.util.List;

public class FirstNameDisplayStrategy implements DisplayStrategy {

    @Override
    public void display(List<Person> personList) {
        personList.stream()
                .sorted(Comparator.comparing(Person::getFirstName))
                .forEach(System.out::println);
    }
}