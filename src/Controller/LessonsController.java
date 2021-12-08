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
    public void updateModel(String pageIDCourseNum) {
        // parse id and course num from the argument
        String pageID = pageIDCourseNum.split(" ")[0];
        String courseNum = pageIDCourseNum.split(" ")[1];

        ArrayList<String> comments = new ArrayList<>();
        comments.add("student1 - added comment");

        String edits = "text edits";
        String pageContent = "page text";

        // call the setters in the model
        model.setPageID(pageID);
        model.setCourseNum(courseNum);
        model.setPageComments(comments);
        model.editPage(edits);
        model.editPage(pageID);
        model.createPage(pageID);
        model.downloadContent(pageID);
        model.removePage(pageID);

        // refresh the view
        view.show();
    }
}
