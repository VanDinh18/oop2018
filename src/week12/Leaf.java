package week12;

public class Leaf implements Component {
    private String name;
    private int age;
    private String sex;

    public Leaf(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public Component getChild(int i){
        return null;
    }

    @Override
    public void addChild(Component child){
    }

    @Override
    public Component getMarried(){
        return null;
    }

    @Override
    public void addMarried(Component married){
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSex(){
        return sex;
    }
}
