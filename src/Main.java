public class Main {

    public static void main(String[] args) {

        ImageEditor imgEditor = new ImageEditor();

        Image img1 = new Image("DolomitesLandscape", 21);
        Image img2 = new Image("EagleCloseUp", 17);

        //importing a new catalog
        imgEditor.loadImage(img1);
        imgEditor.loadImage(img2);

        imgEditor.edit(0, 1, 10);   //Contrast +10
        imgEditor.edit(0, 4, 8);    //Whites +8
        imgEditor.edit(0, 5, -8);   //Blacks -8
        imgEditor.setBaPreview(0, true);
        imgEditor.edit(0, 6, 25);   //Clarity +25
        imgEditor.setBaPreview(0, false);
        imgEditor.edit(1, 3, 15);    //Shadows +10
        System.out.println("\nUNDO:");
        imgEditor.undo(0);
        System.out.println("\nREDO:");
        imgEditor.redo(0);
        System.out.println("\nUNDO:");
        imgEditor.undo(1);
        System.out.println("\nREDO:");
        imgEditor.redo(1);


        //exporting the catalog
        imgEditor.exportImage(0, true);
        imgEditor.exportImage(1, false);
    }
}