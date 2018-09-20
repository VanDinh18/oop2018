package week2.task2;
import week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator_ = this.numerator * other.denominator + other.numerator * this.denominator;
        int demominator_ = this.denominator + other.denominator;
        int ucnn = Task1.gcd(numerator_, demominator_);
        this.numerator = numerator_/ucnn;
        this.denominator = demominator_/ucnn;
        return null;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int numerator_ = this.numerator * other.denominator - other.numerator * this.denominator;
        int demominator_ = this.denominator + other.denominator;
        int ucnn = Task1.gcd(numerator_, demominator_);
        this.numerator = numerator_/ucnn;
        this.denominator = demominator_/ucnn;
        return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        return null;
    }
}
