package school;

public abstract class Person{
    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName ) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() { return lastName; }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}