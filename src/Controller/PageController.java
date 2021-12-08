package Controller;

// import required packages/classes
import Model.Page;
import View.PageView;

public class PageController {
    // keep track of the view
    private Page model;
    private PageView view;

    // constructor
    public PageController(PageView view, Page model) {
        this.model = model;
        this.view = view;

        // set the controller of the view
        this.view.setController(this);

        // display the view
        view.show();
    }

    // method to update the model
    public void updateModel(String pageIDContent) {

        String pageID = pageIDContent.split(" - ")[0];
        String pageContent = pageIDContent.split(" - ")[1];

        // call the setters in the model
        model.setPageID(pageID);
        model.setPageContent(pageContent);

        // refresh the view
        view.show();
    }
}
