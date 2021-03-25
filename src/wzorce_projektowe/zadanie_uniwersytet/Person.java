package wzorce_projektowe.zadanie_uniwersytet;

import wzorce_projektowe.builder.exercise.Pizza;

import java.util.List;

public class Person {
    private String Imie;
    private String Nazwisko;
    private String TeacherOrStudent;

    private String StudentCourse;
    private List<String> TeacherListBlocks;


    private Person(PersonBuilder personBuilder) {
        this.Imie = personBuilder.Imie;
        this.Nazwisko = personBuilder.Nazwisko;
        this.TeacherOrStudent = personBuilder.TeacherOrStudent;

        this.StudentCourse = personBuilder.StudentCourse;
        this.TeacherListBlocks = personBuilder.TeacherListBlocks;
    }

    public String getImie() {
        return Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getTeacherOrStudent() {
        return TeacherOrStudent;
    }

    public String getStudentCourse() {
        return StudentCourse;
    }

    public List<String> getTeacherListBlocks() {
        return TeacherListBlocks;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Imie='" + Imie + '\'' +
                ", Nazwisko='" + Nazwisko + '\'' +
                ", TeacherOrStudent='" + TeacherOrStudent + '\'' +
                ", StudentCourse='" + StudentCourse + '\'' +
                ", TeacherListBlocks=" + TeacherListBlocks +
                '}';
    }

    public static class PersonBuilder {
        private String Imie;
        private String Nazwisko;
        private String TeacherOrStudent;

        private String StudentCourse;
        private List<String> TeacherListBlocks;

        public PersonBuilder(String Imie, String Nazwisko, String TeacherOrStudent) {
            this.Imie = Imie;
            this.Nazwisko = Nazwisko;
            this.TeacherOrStudent = TeacherOrStudent;
        }

        public PersonBuilder setStudentCourse(String studentCourse) {
            StudentCourse = studentCourse;
            return this;
        }

        public PersonBuilder setTeacherListBlocks(List<String> teacherListBlocks) {
            TeacherListBlocks = teacherListBlocks;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
