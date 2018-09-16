package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student

    // TODO: khai báo các phương thức getter, setter cho Student

    private String name;
    private String id;
    private String group;
    private String email;

    Student() {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        name = n;
        id = sid;
        group = "INT22042";
        email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public String getId() {
        return id;
    }
    public void setId(String i) {
        id = i;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String g){
        group = g;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String em){
        email = em;
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
    }
}
