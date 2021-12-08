package Model;

import java.util.ArrayList;

// Holds all the data structures and logic
public class Lessons extends Subject {
    // fields for the Lessons model
    private String courseNum;
    private ArrayList<String> pageComments;

    // methods use to set and get the data of the model
    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String num) {
        this.courseNum = num;
    }

    public ArrayList<String> getPageComments() {
        return pageComments;
    }

    public void setPageComments(ArrayList<String> comment) {
        this.pageComments = comment;
    }
}
