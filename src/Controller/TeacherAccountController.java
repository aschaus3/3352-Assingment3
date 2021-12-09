package Controller;

// import required packages/classes
import Model.TeacherAccount;
import View.TeacherAccountView;

public class TeacherAccountController {
    // keep track of the view
    private TeacherAccount model;
    private TeacherAccountView view;

    // constructor
    public TeacherAccountController(TeacherAccountView view, TeacherAccount model) {
        this.model = model;
        this.view = view;

        // set the controller of the view
        this.view.setController(this);

        // display the view
        view.show();
    }

    // method to update the model
    public void updateModel(String fName, String lName) {

        String firstName = fName;
        String lastName = lName;

        // call the setters in the model
        model.setFirstName(firstName);
        model.setLastName(lastName);

        // refresh the view
        view.show();
    }
}
