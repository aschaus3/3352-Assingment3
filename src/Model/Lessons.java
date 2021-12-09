package Model;

import java.util.ArrayList;

// Holds all the data structures and logic
public class Lessons extends Subject {

    // fields for the Lessons model
    private String pageID;
    private String courseNum;
    private ArrayList<String> pageComments;
    private String pageEdits;
    private String pageContent;

    // methods used to set and get the data of the model
    public String getPageID() {
        return pageID;
    }

    public void setPageID(String ID) {
        this.pageID = ID;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String num) {
        this.courseNum = num;
    }

    public ArrayList<String> getPageComments()   { return pageComments; }

    public void setPageComments(ArrayList<String> comment)   {this.pageComments = comment;}

    public String getPageEdits() { return pageEdits; }

    public void editPage(String edits) {this.pageEdits = edits;}

    public void createPage(String ID) {this.pageID = ID;}

    public void removePage(String ID) {this.pageID = ID;}

    public String getPageContent() {
        return pageContent;
    }
    public void downloadContent(String content) {
        this.pageContent = content;
    }

}
