package week12;

public interface Component {
    public Component getChild(int i);
    public void addChild(Component child);

    public void print();

    public boolean getMarried();
    public String getName();
    public int getAge();
    public String getSex();
}
