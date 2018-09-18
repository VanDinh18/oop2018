package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public Student[] student = new Student[3];

    public boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    void studentsByGroup() {
        for(int i=0; i<student.length; i++){
            if ("INT22041".equals(student[i].getGroup())) {
                System.out.println(student[i].getInfo());
            }
        }
    }

    void removeStudent(String id) {
        int count=0;
        for(int i=0; i<student.length; i++){
            if(student[i].getId().equals(id) == false){
                student[count] = student[i];
                count++;
            }
        }
        for(int i=0; i<count; i++){
            System.out.println(student[i].getInfo());
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dinh 1");
        s1.setId("17020683");
        s1.setGroup("INT22041");
        s1.setEmail("nguyendinh180299@gmail.com");
        //System.out.println(s1.getInfo());

        Student s2 = new Student("Dinh 2", "17020663", "nguyendinh180299@gmail.com");
        //System.out.println(s2.getInfo());

        Student s3 = new Student(s1);
        //System.out.println(s3.getInfo());

        StudentManagement sv = new StudentManagement();

        sv.student[0] = s1;
        sv.student[1] = s2;
        sv.student[2] = s3;
        sv.studentsByGroup();
        sv.removeStudent("17020683");
    }
}
