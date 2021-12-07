package Controller;

// import required packages
import Model.Lessons;
import View.LessonsView;

public class LessonsController {
    // keep track of the view
    private LessonsView view;
    private Lessons model;

    // constructor
    public LessonsController(LessonsView view, Lessons model) {
        this.view = view;
        this.model = model;

        // display the view
        view.show();
    }

    // method to update the model
    public void updateModel() {
        // call the setters in the model
    }
}
