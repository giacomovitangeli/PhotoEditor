public class JPEG implements ExportStrategy
{
    public void export(Originator or)   //simula l'algoritmo di compressione JPEG
    {
        String newName = or.getImage().getName() + ".jpg";
        or.getImage().setName(newName);
        float newSize = or.getImage().getSize()/10;
        or.getImage().setSize(newSize);
        or.getImage().print();
        System.out.println("\nJPEG IMAGE EXPORTED");
    }
}