package week12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component {

    private String name;
    private int age;
    private String sex;
    private boolean married;

    private List<Component> Member = new ArrayList<>();

    public Composite(String name, int age, String sex, boolean married) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.married = married;
    }

    @Override
    public void print(){
        System.out.println(getName() + "\t" + getAge() + "\t" + getSex() + "\t" + getMarried());

        Iterator<Component> MemberIterator = Member.iterator();

        while(MemberIterator.hasNext()){
            Component c = MemberIterator.next();
            c.print();
        }
    }

    @Override
    public Component getChild(int i){
        return Member.get(i);
    }

    @Override
    public void addChild(Component child){
        Member.add(child);
    }

    @Override
    public boolean getMarried(){
        return married;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge(){
        return age;
    }

    @Override
    public String getSex(){
        return sex;
    }
}
