package Controller;

// import required packages/classes
import Model.Lessons;
import View.LessonsView;

import java.util.ArrayList;

// controller class for Lessons model
public class LessonsController {
    // keep track of the view
    private Lessons model;
    private LessonsView view;

    // constructor
    public LessonsController(LessonsView view, Lessons model) {
        this.model = model;
        this.view = view;

        // set the controller of the view
        this.view.setController(this);

        // display the view
        view.show();
    }

    // method to update the model
    public void updateModel(String courseNum) {

        ArrayList<String> comment = new ArrayList<>();
        comment.add("Student1 - random comment");

        // call the setters in the model
        model.setCourseNum(courseNum);
        model.setPageComments(comment);

        // refresh the view
        view.show();
    }
}
