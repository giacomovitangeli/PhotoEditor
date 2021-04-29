public class Settings
{
    private int parameters[];

    public Settings()
    {
        parameters = new int[9];
        for(int i=0; i<9; i++)
            parameters[i] = 0;
    }

    public void print()
    {
        System.out.println("\nSETTINGS: ");
        System.out.println("Exposure: " + parameters[0]);
        System.out.println("Contrast: " + parameters[1]);
        System.out.println("Hilights: " + parameters[2]);
        System.out.println("Shadows: " + parameters[3]);
        System.out.println("Whites: " + parameters[4]);
        System.out.println("Blacks: " + parameters[5]);
        System.out.println("Clarity: " + parameters[6]);
        System.out.println("Vibrance: " + parameters[7]);
        System.out.println("Saturation: " + parameters[8]);
    }

    public int getParameter(int index)
    {
        return this.parameters[index];
    }

    public void setParameter(int index, int value)
    {
        int v = this.parameters[index] + value;
        if((v>=-100) && (v<=100))
            this.parameters[index] = v;
        else
            System.out.println("Value out of range!");
    }
}
