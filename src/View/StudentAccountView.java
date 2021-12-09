package View;

// import required packages/classes
import Controller.StudentAccountController;
import Model.Observer;
import Model.StudentAccount;

public class StudentAccountView extends Observer {
    // keep track of the model and controller
    private StudentAccount model;
    private StudentAccountController controller;

    // constructor
    public StudentAccountView(StudentAccount model, StudentAccountController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    // empty constructor
    public StudentAccountView() {}

    // method to update the model when the user inputs data
    public void onStudentAccountUpdate() {
        // collects data from the user
        String newStudentInfo = "Jim Halpert";

        // send the data to the controller
        this.controller.updateModel(newStudentInfo);
    }

    // implement the update method from Observer class
    public void update() {
        this.show();
    }

    // method to display or refresh the view
    public void show() {
        // code to refresh of display the view
    }

    // methods use to set and get the data of the controller
    public StudentAccount getModel() {
        return model;
    }

    public void setModel(StudentAccount model) {
        // dettach itself if model already existed
        if (this.model != null) {
            this.model.dettach(this);
        }

        this.model = model;
        this.model.attach(this); // the controller attaches itself as an observer
    }

    public StudentAccountController getController() {
        return controller;
    }

    public void setController(StudentAccountController controller) {
        this.controller = controller;
    }
}
