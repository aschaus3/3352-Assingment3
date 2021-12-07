package View;

// import required packages/classes
import Controller.LessonsController;
import Model.Lessons;

// class to display the UI for Lessons model
public class LessonsView extends Observer {
    // keep track of the model and controller
    private Lessons model;
    private LessonsController controller;

    // constructor
    public LessonsView(Lessons model, LessonsController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    // empty constructor
    public LessonsView() {}

    // method to update the model when the user inputs data
    public void onLessonsUpdate() {
        // collects data from the user
        String newLessonsInfo = "SE 3352A";

        // send the data to the controller
        this.controller.updateModel(newLessonsInfo);
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
    public Lessons getModel() {
        return model;
    }

    public void setModel(Lessons model) {
        // dettach itself if model already existed
        if (this.model != null) {
            this.model.dettach(this);
        }

        this.model = model;
        this.model.attach(this); // the controller attaches itself as an observer
    }

    public LessonsController getController() {
        return controller;
    }

    public void setController(LessonsController controller) {
        this.controller = controller;
    }
}
