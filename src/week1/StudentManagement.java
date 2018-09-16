package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        if(s1.getGroup() == s2.getGroup())
            return true;
        else
            return false;
    }

    void studentsByGroup() {

    }

    void removeStudent(String id) {

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dinh");
        s1.setId("17020683");
        s1.setGroup("INT22041");
        s1.setEmail("nguyendinh180299@gmail.com");
        System.out.println(s1.getName());
        s1.getInfo();

        Student s2 = new Student("Dinh", "17020683", "nguyendinh180299@gmail.com");
        s2.getInfo();

        Student s3 = new Student(s1);
        s3.getInfo();
    }
}
