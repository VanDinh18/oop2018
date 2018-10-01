package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        int max = 0;
        if(m >= n)
            max = m;
        if(n >= m)
            max = n;
        return max;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        String bmi = new String();
        double calculateBMI = weight/(height * height);
        if(calculateBMI < 18.5)
            bmi = "Thiếu cân";
        if(calculateBMI >= 18.5 && calculateBMI <= 22.99)
            bmi = "Bình thường";
        if(calculateBMI >= 23 && calculateBMI <= 24.99)
            bmi = "Thừa cân";
        if (calculateBMI > 25)
            bmi = "Béo phì";
        return bmi;
    }
}