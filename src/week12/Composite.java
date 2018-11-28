package week12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements Component {

    private String name;
    private int age;
    private String sex;

    private List<Component> ListChild = new ArrayList<>();
    private Component married;


    public Composite(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public void print(){
        System.out.println(getName() + " " + getAge() + " " + getSex());
        System.out.println(getMarried().getName() + " " + getMarried().getAge() + " " + getMarried().getSex());
        System.out.println("List Child:");
        Iterator<Component> ChildIterator = ListChild.iterator();
        while(ChildIterator.hasNext()){
            Component c = ChildIterator.next();
            c.print();
        }

    }

    @Override
    public Component getChild(int i){
        return ListChild.get(i);
    }

    @Override
    public void addChild(Component child){
        ListChild.add(child);
    }

    @Override
    public Component getMarried(){
        return married;
    }

    @Override
    public void addMarried(Component married){
        this.married = married;
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
