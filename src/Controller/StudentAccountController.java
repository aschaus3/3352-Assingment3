package Controller;

// import required packages/classes
import Model.StudentAccount;
import View.StudentAccountView;

public class StudentAccountController {
    // keep track of the view
    private StudentAccount model;
    private StudentAccountView view;

    // constructor
    public StudentAccountController(StudentAccountView view, StudentAccount model) {
        this.model = model;
        this.view = view;

        // set the controller of the view
        this.view.setController(this);

        // display the view
        view.show();
    }

    // method to update the model
    public void updateModel(String teacherInfo) {

        String firstName = teacherInfo.split(" ")[0];
        String lastName = teacherInfo.split(" ")[1];

        // call the setters in the model
        model.setFirstName(firstName);
        model.setLastName(lastName);

        // refresh the view
        view.show();
    }
}
