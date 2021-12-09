package Model;

public class StudentAccount extends Subject {
    // fields required for the model
    private String firstName;
    private String lastName;

    // methods used to set and get the data of the model
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
