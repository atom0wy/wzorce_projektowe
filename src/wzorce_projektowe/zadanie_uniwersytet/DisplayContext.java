package wzorce_projektowe.zadanie_uniwersytet;

import java.util.List;

public class DisplayContext {
    private DisplayStrategy displayStrategy;

    public void setDisplayStrategy(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    public void display(List<Person> personList) {
        displayStrategy.display(personList);
    }
}