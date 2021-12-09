package View;

// import required packages/classes
import Controller.PageController;
import Model.Observer;
import Model.Page;

public class PageView extends Observer {
    // keep track of the model and controller
    private Page model;
    private PageController controller;

    // constructor
    public PageView(Page model, PageController controller) {
        this.setModel(model);
        this.setController(controller);
    }

    // empty constructor
    public PageView() {}

    // method to update the model when the user inputs data
    public void onPageUpdate() {
        // collects data from the user
        String newLessonsInfo = "1 - 'Intro To Databases'";

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
    public Page getModel() {
        return model;
    }

    public void setModel(Page model) {
        // dettach itself if model already existed
        if (this.model != null) {
            this.model.dettach(this);
        }

        this.model = model;
        this.model.attach(this); // the controller attaches itself as an observer
    }

    public PageController getController() {
        return controller;
    }

    public void setController(PageController controller) {
        this.controller = controller;
    }
}
