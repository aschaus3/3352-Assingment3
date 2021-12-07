package Controller;

// import required packages/classes
import Model.Lessons;
import View.LessonsView;

// controller class for Lessons model
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
    public void updateModel(String pageIDCourseNum) {
        // parse id anf course from the argument
        String pageID = "";
        String courseNum = "";

        // call the setters in the model
        model.setPageID(pageID);
        model.setCourseNum(courseNum);
    }
}
