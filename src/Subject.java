import java.util.ArrayList;

public abstract class Subject
{
    private ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer o)
    {
        observers.add(o);
    }

    public void detach(Observer o)
    {
        observers.remove(o);
    }

    protected void notifyObservers(Originator or)
    {
        for (Observer o : observers)
            o.update(or);
    }
}