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
        this.name = n;
        this.id = sid;
        this.group = "INT22042";
        this.email = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
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

    public String getInfo(){
        return name + id + group + email;
    }
}
