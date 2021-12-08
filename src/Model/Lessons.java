package Model;

// Holds all the data structures and logic
public class Lessons extends Subject {
    // fields for the Lessons model
    private String pageID;
    private String courseNum;

    private String pageComments;



    // methods use to set and get the data of the model
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

    public String getPageComments()   { return pageComments; }

    public void setPageComments(String comment)   {this.pageComments = comment;}
}
