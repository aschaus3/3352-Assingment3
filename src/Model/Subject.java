package Model;

// import required packages/classes
import java.util.ArrayList;

// Subject abstract class for the Observer design pattern
public abstract class Subject {
    ArrayList<Observer> observers = new ArrayList<>();

    // method to attach the observer to the subject
    public void attach(Observer o) {
        observers.add(o);
    }

    // method to dettach the observer from the subject
    public void dettach(Observer o) {
        observers.remove(o);
    }

    // method to notify all the observers
    public void Notify() {
        for (Observer o : observers) {
            o.update();
        }
    }
}
