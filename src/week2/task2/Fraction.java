package week2.task2;
import week2.task1.Task1;

import javax.xml.stream.FactoryConfigurationError;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator;
    int denominator;
    public int getNumerator(){
         return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public Fraction(){

    }
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator_ = this.numerator * other.denominator + other.numerator * this.denominator;
        int denominator_ = this.denominator * other.denominator;
        int ucnn = Task1.gcd(numerator_, denominator_);

        Fraction add = new Fraction();
        add.numerator = numerator_/ucnn;
        add.denominator = denominator_/ucnn;
        return add;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator_ = this.numerator * other.denominator - other.numerator * this.denominator;
        int denominator_ = this.denominator * other.denominator;
        int ucnn = Task1.gcd(numerator_, denominator_);

        Fraction subtract = new Fraction();
        subtract.numerator = numerator_/ucnn;
        subtract.denominator = denominator_/ucnn;
        return subtract;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator_ = this.numerator * other.numerator;
        int denominator_ = this.denominator * other.denominator;
        int ucnn = Task1.gcd(numerator_, denominator_);

        Fraction multiply = new Fraction();
        multiply.numerator = numerator_/ucnn;
        multiply.denominator = denominator_/ucnn;
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
        if(f.denominator == 1)
            System.out.println(f.numerator);
        else if(f.denominator == -1)
            System.out.println(-f.denominator);
        else
            System.out.println(f.numerator + "/" + f.denominator);
    }

    public boolean equals(Fraction obj){
        float other1 = (float) (this.numerator/this.denominator);
        float other2 = (float) (obj.numerator/obj.denominator);
        if(other1 == other2)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(5, 4);

        Fraction f3 = f2.add(f1);
        print(f3);
        Fraction f4 =  f1.subtract(f2);
        print(f4);
        Fraction f5 = f1.multiply(f2);
        print(f5);
        Fraction f6 = f1.divide(f2);
        print(f6);
        if(f1.equals(f2))
            System.out.println("bang nhau");
        else
            System.out.println("không bằng nhau");
    }
}
