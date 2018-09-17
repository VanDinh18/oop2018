package week1;
import java.util.ArrayList;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public ArrayList<Student> student = new ArrayList<Student>(100);

    public boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    void studentsByGroup() {
        for(int i=0; i<student.size(); i++){
            if(student.get(i).getGroup().equals("INT22041")) {
                System.out.println(student.get(i).getInfo());
            }
        }
        System.out.println("\n");
    }

    void removeStudent(String id) {
        for(int i=0; i<student.size(); i++){
            if(student.get(i).getId().equals(id)){
                student.remove(i);
            }
        }
        for(int i=0; i<student.size(); i++){
            System.out.println(student.get(i).getName() + "\t");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dinh 1");
        s1.setId("17020683");
        s1.setGroup("INT22041");
        s1.setEmail("nguyendinh180299@gmail.com");
        //System.out.println(s1.getName());
        //System.out.println(s1.getInfo());

        Student s2 = new Student("Dinh 2", "17020663", "nguyendinh180299@gmail.com");
        //System.out.println(s2.getInfo());

        Student s3 = new Student(s1);
        //System.out.println(s3.getInfo());

        StudentManagement sv = new StudentManagement();

        sv.student.add(0, s1);
        sv.student.add(1, s2);
        sv.student.add(2, s3);
        sv.studentsByGroup();
        sv.removeStudent("17020683");
    }
}
