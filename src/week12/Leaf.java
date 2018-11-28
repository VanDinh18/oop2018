package week12;

public class Leaf implements Component {
    private String name;
    private int age;
    private String sex;
    private boolean married;

    public Leaf(String name, int age, String sex, boolean married) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.married = married;
    }

    @Override
    public void print(){
        System.out.println(getName() + "\t" + getAge() + "\t" + getSex() +  "\t" + getMarried());
    }

    @Override
    public Component getChild(int i){
        return null;
    }

    @Override
    public void addChild(Component child){
    }

    @Override
    public boolean getMarried(){
        return married;
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

