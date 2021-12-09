package View;

import Controller.TeacherAccountController;
import Model.Observer;
import Model.TeacherAccount;

public class TeacherAccountView extends Observer {
    // keep track of the model and controller
    private TeacherAccount model;
    private TeacherAccountController controller;

    // constructor
    public TeacherAccountView(TeacherAccount model, TeacherAccountController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    // empty constructor
    public TeacherAccountView() {}

    // method to update the model when the user inputs data
    public void onTeacherAccountUpdate() {
        // collects data from the user
        String newTeacherFirstName = "Dwayne the";
        String newTeacherLastName = "Rock Johnson";

        // send the data to the controller
        this.controller.updateModel(newTeacherFirstName, newTeacherLastName);
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
    public TeacherAccount getModel() {
        return model;
    }

    public void setModel(TeacherAccount model) {
        // dettach itself if model already existed
        if (this.model != null) {
            this.model.dettach(this);
        }

        this.model = model;
        this.model.attach(this); // the controller attaches itself as an observer
    }

    public TeacherAccountController getController() {
        return controller;
    }

    public void setController(TeacherAccountController controller) {
        this.controller = controller;
    }
}
