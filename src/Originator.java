public class Originator extends Subject
{
    private Image image;
    private Settings settings;
    private boolean baPreview;
    private int undoCounter;


    public Originator(Image img)
    {
        this.image = img;
        this.baPreview = false;
        this.settings = new Settings();
    }


    public void setSettings(int parameter, int value)
    {
        this.settings.setParameter(parameter, value);
        notifyObservers(this);
    }

    public Settings getSettings()
    {
        return settings;
    }

    public Memento setMemento(int p, int v)
    {
        int edit[] = new int[2];
        edit[0] = p;
        edit[1] = v;
        return new Memento(edit);
    }

    //unreId: [true to undo | false to redo]
    public void getMemento(Memento memento, boolean unreId)
    {
        int parameter = memento.getState()[0];
        int value = memento.getState()[1];
        if(unreId)
            value *= -1;

        this.setSettings(parameter, value);
    }

    public Image getImage()
    {
        return image;
    }

    public void setBaPreview(boolean baPreview)
    {
        this.baPreview = baPreview;
    }

    public boolean getBaPreview()
    {
        return baPreview;
    }

    public void setUndoCounter(int undoCounter)
    {
        this.undoCounter = undoCounter;
    }

    public int getUndoCounter()
    {
        return undoCounter;
    }
}