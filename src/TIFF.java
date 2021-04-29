public class TIFF implements ExportStrategy
{
    public void export(Originator or)
    {
        String newName = or.getImage().getName() + ".tif";
        or.getImage().setName(newName);
        or.getImage().print();
        System.out.println("\nTIFF IMAGE EXPORTED");
    }
}