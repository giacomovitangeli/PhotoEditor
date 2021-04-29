public class Memento
{
    private int[] state;

    public Memento(int[] edit)
    {
        this.state = edit;
    }

    public int[] getState()
    {
        return state;
    }
}