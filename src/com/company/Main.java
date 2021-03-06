package com.company;

// import required packages/classes
import Controller.LessonsController;
import Controller.PageController;
import Controller.StudentAccountController;
import Controller.TeacherAccountController;
import Model.Lessons;
import Model.Page;
import Model.StudentAccount;
import Model.TeacherAccount;
import View.LessonsView;
import View.PageView;
import View.StudentAccountView;
import View.TeacherAccountView;

public class Main {

    public static void main(String[] args) {
        // create an instance of the model
        Lessons m = new Lessons();

        // create an instance of the view
        LessonsView v = new LessonsView();

        // create instances of pages
        Page p1 = new Page();
        Page p2 = new Page();

        // create instances of views for the pages
        PageView pv1 = new PageView();
        PageView pv2 = new PageView();

        // create an instance of the student account model
        StudentAccount s = new StudentAccount();

        // create an instance of the student account view
        StudentAccountView sv  = new StudentAccountView();

        // create and instance of the teacher account model
        TeacherAccount t = new TeacherAccount();

        // create an instance of the teacher account view
        TeacherAccountView tv = new TeacherAccountView();

        // create an instance of the controller
        LessonsController c = new LessonsController(v, m);

        // create instances controllers for the pages
        PageController pc1 = new PageController(pv1, p1);
        PageController pc2 = new PageController(pv2, p2);

        // create the controller for the student account
        StudentAccountController sc = new StudentAccountController(sv, s);

        // create the controller for the teacher account
        TeacherAccountController tc = new TeacherAccountController(tv, t);
    }
}
