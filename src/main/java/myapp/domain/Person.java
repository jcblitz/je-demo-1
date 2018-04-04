package myapp.domain;

public class Person {
    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getGreeting() {
        return String.format("Hello %s %s", this.firstName, this.lastName);
    }
}
