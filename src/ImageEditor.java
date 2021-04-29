import java.util.ArrayList;

public class ImageEditor
{
    private ArrayList<Originator> catalog;
    private ArrayList<CareTaker> careTakers;
    private SmartPreview preview;
    private ExportStrategy expStrat;

    public ImageEditor()
    {
        this.catalog = new ArrayList<Originator>();
        this.careTakers = new ArrayList<CareTaker>();
        preview = new SmartPreview();
    }

    public void loadImage(Image img)
    {
        Originator or = new Originator(img);
        or.attach(preview);
        this.catalog.add(or);
        CareTaker ct = new CareTaker();
        this.careTakers.add(ct);
    }

    public void edit(int index, int parameter, int value)
    {
        this.catalog.get(index).setSettings(parameter, value);
        this.careTakers.get(index).add(this.catalog.get(index).setMemento(parameter, value));
        this.catalog.get(index).setUndoCounter(1);
    }

    public void undo(int index)
    {
        int size = this.careTakers.get(index).getSize();
        int count = this.catalog.get(index).getUndoCounter();
        this.catalog.get(index).getMemento(this.careTakers.get(index).get(size-count), true);
        this.catalog.get(index).setUndoCounter(count+1);
    }

    public void redo(int index)
    {
        int size = this.careTakers.get(index).getSize();
        int count = this.catalog.get(index).getUndoCounter()-1;
        this.catalog.get(index).setUndoCounter(count);
        this.catalog.get(index).getMemento(this.careTakers.get(index).get(size-count), false);
    }

    public void setBaPreview(int index, boolean ba)
    {
        catalog.get(index).setBaPreview(ba);
    }

    public void exportImage(int index, boolean losslessQuality)
    {
        if(losslessQuality)
            expStrat = new TIFF();
        else
            expStrat = new JPEG();
        expStrat.export(this.catalog.get(index));
    }
}