package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == b)
            return a;
        if(a > b)
            return gcd(a-b, b);
        if(a < b)
            return gcd(a, b-a);
        return 0;
    }

    public static int fibonacci(int n) {
        if(n == 0 || n ==  1)
            return 1;
        if(n >= 2)
            return fibonacci(n-1)+ fibonacci(n-2);
        return 0;
    }

    public static void main(String[] args){
        System.out.println(gcd(-8, 16));
        System.out.println(fibonacci(5));
    }
}
