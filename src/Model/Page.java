package Model;

public class Page extends Subject {
    // fields for the Page model
    private String pageID;
    private String pageContent;

    // methods used to set and get the data of the model
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
