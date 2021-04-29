public class SmartPreview implements Observer, Preview
{
    private BeforeAfterPreview baP;

    public void update(Originator or)
    {
        print(or);
    }

    public void print(Originator or)
    {
        if (!or.getBaPreview()){
            System.out.println("\nSTANDARD PREVIEW: ");
            or.getImage().print();
            or.getSettings().print();
        }else{
            baP = new BeforeAfterPreview();
            baP.print(or);
        }
    }
}