package com.company;

// import required packages/classes
import Controller.LessonsController;
import Model.Lessons;
import View.LessonsView;

public class Main {

    public static void main(String[] args) {
        // create an instance of the model
        Lessons m = new Lessons();

        // create an instance of the view
        LessonsView v = new LessonsView();

        // create an instance of the controller
        LessonsController c = new LessonsController(v, m);
    }
}
