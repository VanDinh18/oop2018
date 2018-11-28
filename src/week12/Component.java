package week12;

public interface Component {
    public Component getChild(int i);
    public void addChild(Component child);
    public void addMarried(Component married);
    public Component getMarried();
    public void print();
    public String getName();
    public int getAge();
    public String getSex();
}
