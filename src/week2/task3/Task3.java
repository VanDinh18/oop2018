package week2.task3;


public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Teacher{
    // thuộc tính tên, tuổi, trình độ của giáo viên
    private String name;
    private String age;
    private String level;

    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getLevel(){
        return level;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setLevel(String level){
        this.level = level;
    }

    Teacher(String name, String age, String level){
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getInfo(){
        return "Tên: " + name + " Tuổi: " + age + " Trình độ: " + level;
    }
    // kiểm tra giáo viên dạy cùng lóp
    public boolean sameLevel(Teacher t1, Teacher t2){
        return t1.level.equals(t2.level);
    }
    // phương thức xếp loại giáo viên
    public void levelTeacher(Teacher t){
        if("A".equals(t.getLevel())){
            System.out.println("Giao vien gioi");
        }
        if("B".equals(t.getLevel())){
            System.out.println("giao vien xep loai kha");
        }
        if("C".equals(t.getLevel())){
            System.out.println("Giao vien xep loai trung binh");
        }
    }

}
class mySchool{
    // tên, nơi sinh, học cấp?, quãng đường di chuyển
    private String name;
    private String place;
    private String type;
    private int distance;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance(){
        return distance;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    mySchool(String name, String place, String type, int distance) {
        this.name = name;
        this.place = place;
        this.type = type;
        this.distance = distance;
    }
    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Place: " + place);
        System.out.println("Type: " + type);
        System.out.println("Distance: " + distance + "km");
    }
    public boolean atmyHometown(){
        return place.equals("Nam Định");
    }
    public void transport(){
        if( distance <= 2 ) System.out.println("Đi bộ tới trường");
        else if( distance > 2 && distance <=5 ) System.out.println("Đi tới trường bằng xe đạp");
        else System.out.println("Đi tới trường bằng xe buýt");
    }

}
class Lamp {
    // thuộc tính đèn bật/tắt, màu sắc, độ cao 
    private boolean isOn;
    private String colour;
    private int high;

    public void getOn() {
        this.isOn = true;
    }
    public void getOff() {
        this.isOn = false;
    }
    //kiểm tra đèn sáng không
    void displayLightStatus() {
        if(isOn == true)
            System.out.println("Đèn đang bật");
        else
            System.out.println("Đèn đã tắt");
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHigh(int high) {
        this.high = high;
    }
    public int getHigh(){
        return high;
    }
}