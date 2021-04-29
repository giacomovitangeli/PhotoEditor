public class Image
{
    private String name;
    private float size;
    private String location;

    public Image(String name, float size)
    {
        this.name = name;
        this.size = size;
        this.location = "/home/giacomo/Pictures";
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String n)
    {
        this.name = n;
    }

    public float getSize()
    {
        return this.size;
    }

    public void setSize(float s)
    {
        this.size = s;
    }

    public String getLocation()
    {
        return this.location;
    }

    public void print() {
        System.out.println("\nFileName: " + name);
        System.out.println("Location: " + location);
        System.out.println("Size: " + size + " MB");
    }
}