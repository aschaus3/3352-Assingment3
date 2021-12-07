package Controller;

public class LessonsController
{
    // Giving the controller access to the model and view
    Model.Lessons model;
    View.LessonsPage view;

    public LessonsController(Model.Lessons model, View.LessonsPage view)
    {
        this.model = model;
        this.view = view;
        this.view.setController(this);

        // Allows controller to display the view
        view.show();
    }

    // Updates the course number, Called in View
    public void updateCourseNum(String newNum)
    {
        //Method to update the course number
        model.setCourseNum(newNum);
    }
}
