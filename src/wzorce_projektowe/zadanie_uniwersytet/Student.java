package wzorce_projektowe.zadanie_uniwersytet;

public class Student extends Person {

    private String course;

    public Student(StudentBuilder studentBuilder) {
        super(studentBuilder.firstName, studentBuilder.lastName);
        this.course = studentBuilder.course;
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private String course;

        public StudentBuilder(String firstName, String lastName, String course) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.course = course;
        }

        public Student build() {
            return new Student(this);
        }
    }
}