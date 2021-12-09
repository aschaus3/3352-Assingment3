package Model;

public class TeacherAccount extends Subject {
    // fields for the Page model
    private String fName;
    private String lName;

    // method to update the model when the user inputs data
    public String getFirstName() {
        return fName;
    }

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public String getLastName() {
        return lName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }
}
