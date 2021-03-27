package wzorce_projektowe.zadanie_uniwersytet;

import java.util.List;

public class PersonFacade {

    public Student addStudent(String firstName, String lastName, String course) {
        return new Student.StudentBuilder(firstName, lastName, course).build();
    }

    public Teacher addTeacher(String firstName, String lastName, List<String> blocks) {
        return new Teacher.TeacherBuilder(firstName, lastName).setBlocks(blocks).build();
    }

    public void displayFirstNameSorted(List<Person> personList) {
        this.display(new FirstNameDisplayStrategy(), personList);
    }

    public void displayLastNameSorted(List<Person> personList) {
        this.display(new LastNameDisplayStrategy(), personList);
    }

    private void display(DisplayStrategy displayStrategy, List<Person> personList) {
        DisplayContext displayContext = new DisplayContext();
        displayContext.setDisplayStrategy(displayStrategy);
        displayContext.display(personList);
    }
}