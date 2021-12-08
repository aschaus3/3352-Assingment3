package com.company;

// import required packages/classes
import Controller.LessonsController;
import Controller.PageController;
import Model.Lessons;
import Model.Page;
import View.LessonsView;
import View.PageView;

public class Main {

    public static void main(String[] args) {
        // create an instance of the model
        Lessons m = new Lessons();

        // create instances of pages
        Page p1 = new Page();
        Page p2 = new Page();

        // create instances of views for the pages
        PageView pv1 = new PageView();
        PageView pv2 = new PageView();

        // create instances controllers for the pages
        PageController pc1 = new PageController(pv1, p1);
        PageController pc2 = new PageController(pv2, p2);

        // create an instance of the view
        LessonsView v = new LessonsView();

        // create an instance of the controller
        LessonsController c = new LessonsController(v, m);
    }
}
