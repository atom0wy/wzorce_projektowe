package wzorce_projektowe;

import java.util.Objects;

public class Person {
    String pesel;
    String name;

    public Person(String pesel, String name) {
        this.pesel = pesel;
        this.name = name;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(pesel, person.pesel) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel, name);
    }
}