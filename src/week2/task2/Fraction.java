package week2.task2;
import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public Fraction(){
        this.numerator = 0;
    }

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới

        Fraction add = new Fraction();

        if(other.numerator == 0){
            add.numerator = this.numerator;
            add.denominator = this.denominator;
        }
        if(this.numerator == 0){
            add.numerator = other.numerator;
            add.denominator = other.denominator;
        }
        if(other.numerator != 0 && this.numerator != 0){
            int numerator_ = this.numerator * other.denominator + other.numerator * this.denominator;
            int denominator_ = this.denominator * other.denominator;
            int ucnn = Task1.gcd(numerator_, denominator_);
            add.numerator = numerator_/ucnn;
            add.denominator = denominator_/ucnn;
        }
        return add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction subtract = new Fraction();

        if(other.numerator == 0 && this.numerator != 0){
            subtract.numerator = this.numerator;
            subtract.denominator = this.denominator;
        }
        if(this.numerator == 0 && other.numerator != 0){
            subtract.numerator = -other.numerator;
            subtract.denominator = other.denominator;
        }
        if(this.numerator != 0 && this.numerator != other.numerator) {
            int numerator_ = this.numerator * other.denominator - other.numerator * this.denominator;
            int denominator_ = this.denominator * other.denominator;
            int ucnn = Task1.gcd(numerator_, denominator_);
            subtract.numerator = numerator_ / ucnn;
            subtract.denominator = denominator_ / ucnn;
        }
        return subtract;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction multiply = new Fraction();

        if(other.numerator != 0 && this.numerator != 0) {
            int numerator_ = this.numerator * other.numerator;
            int denominator_ = this.denominator * other.denominator;
            int ucnn = Task1.gcd(numerator_, denominator_);
            multiply.numerator = numerator_ / ucnn;
            multiply.denominator = denominator_ / ucnn;
        }
        return multiply;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator_ = this.numerator * other.denominator;
        int denominator_ = this.denominator * other.numerator;
        int ucnn = Task1.gcd(numerator_, denominator_);

        Fraction divide = new Fraction();
        divide.numerator = numerator_/ucnn;
        divide.denominator = denominator_/ucnn;
        return divide;
    }

    public static void print(Fraction f){
        if(f.numerator == 0)
            System.out.println(f.numerator);
        else if(f.denominator == 1)
            System.out.println(f.numerator);
        else if(f.denominator == -1)
            System.out.println(-f.denominator);
        else
            System.out.println(f.numerator + "/" + f.denominator);
    }

    public boolean equals(Fraction obj){
        float other1 = (float)this.numerator / (float)this.denominator;
        float other2 = (float)obj.numerator / (float)obj.denominator;
        if(other1 == other2)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Fraction f1 = new Fraction(-3, 4);
        Fraction f2 = new Fraction(1, 4);

        Fraction f3 = f2.add(f1);
        print(f3);
        Fraction f4 =  f1.subtract(f2);
        print(f4);
        Fraction f5 = f1.multiply(f2);
        print(f5);
        Fraction f6 = f1.divide(f2);
        print(f6);
        if(f1.equals(f2))
            System.out.println("2 phân số bằng nhau");
        else
            System.out.println("2 phân số không bằng nhau");
    }
}
