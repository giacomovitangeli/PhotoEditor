public class BeforeAfterPreview implements Preview
{
    public void print(Originator or)
    {
        System.out.println("\n\nBEFORE PREVIEW: ");
        or.getImage().print();
        Settings s = new Settings();  //default settings
        s.print();

        System.out.println("\nAFTER PREVIEW: ");
        or.getImage().print();
        or.getSettings().print();   //new settings
    }
}