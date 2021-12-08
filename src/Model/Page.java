package Model;

public class Page extends Subject {
    // fields for the Page model
    private String pageID;
    private String pageContent;

    // method to update the model when the user inputs data
    public String getPageID() {
        return pageID;
    }

    public void setPageID(String ID) {
        this.pageID = ID;
    }

    public String getPageContent() {
        return pageContent;
    }

    public void setPageContent(String pageContent) {
        this.pageContent = pageContent;
    }
}
