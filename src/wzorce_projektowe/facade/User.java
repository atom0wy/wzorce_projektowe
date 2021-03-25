package wzorce_projektowe.facade;

public class User {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void sendMail() {
        System.out.println("wysyłanie wiadomości");
    }

    public void delete() {
        System.out.println("usuwanie użytkownika");
    }

}