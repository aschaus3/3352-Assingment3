package View;

public class LessonsPage
{
    // Linking the View to the Model and Controller
    private Model.Lessons model;
    private Controller.LessonsController controller;

    public LessonsPage(Model.Lessons model, Controller.LessonsController controller)
    {
        this.setModel(model);
        this.setController(controller);
    }

    // Get user input from the view, update course number with it
    public void onCourseNumUpdate()
    {
        //Collect data from user input
        String userInput = "new number";
        this.controller.updateCourseNum(userInput);
    }

    // For actually displaying the UI
    public void show()
    {
        //Would display or refresh the page
    }

    public Model.Lessons getModel() {
        return model;
    }

    public void setModel(Model.Lessons model) {
        this.model = model;
    }

    public Controller.LessonsController getController() {
        return controller;
    }

    public void setController(Controller.LessonsController controller) {
        this.controller = controller;
    }
}
