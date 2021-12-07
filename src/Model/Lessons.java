package Model;

// Holds all the data structures and logic
public class Lessons
{
    private String pageID;
    private String courseNum;


    public String getPageID(){
        return pageID;
    }

    public void setPageID(String ID){
        this.pageID = ID;
    }

    public String getCourseNum(){
        return courseNum;
    }

    public void setCourseNum(String num){
        this.courseNum = num;
    }
}
