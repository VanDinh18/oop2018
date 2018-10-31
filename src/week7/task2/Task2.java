package week7.task2;

import java.io.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task2 {
    public void NullPointerExceptionTest() throws NullPointerException{
        String str = null;
        if(str.equals("oop")){
            throw new NullPointerException();
        }
    }

    public void ArrayIndexOutOfBoundsExceptionTest() throws ArrayIndexOutOfBoundsException{
        int [] array = new int[2];
        array[0] = 3;
        array[2] = 5;
        throw new ArrayIndexOutOfBoundsException();
    }

    public void ArithmeticExceptionTest() throws ArithmeticException{ //xu ly ngoai le so hoc
        BigDecimal x = new BigDecimal (1);
        BigDecimal y = new BigDecimal (3);
        x = x.divide(y);
        throw new ArithmeticException();

        //x = x.divide (y, 7, BigDecimal.ROUND_DOWN);
        //System.out.println (x.toString ());
    }

    public void ClassCastExceptionTest() throws ClassCastException{ //truyen doi tuong den mot lop con ma no khong phai ca the
        Object i = Integer.valueOf(42);
        String s = (String)i;
    }

//    public void IOExceptionTest() throws IOException{
//        BufferedReader br = null;
//        br = new BufferedReader(new FileReader("D:/word.txt"));
//        //br = new BufferedReader(new FileReader("D:/words.txt"));
//        String line;
//        while ((line = br.readLine()) != null){
//            System.out.println(line);
//        }
//        throw new IOException();
//    }

    public void IOExceptionTest()throws IOException{
        String resource = "D://word.txt";
        File file = new File(resource);
        if (file.exists())
            System.out.println("exists");
        throw new IOException();
    }
    public void FileNotFoundExceptionTest() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("D:/word.txt"));
        throw new FileNotFoundException();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Task2 task2 = new Task2();
        try {
            task2.NullPointerExceptionTest();
        }
        catch (NullPointerException e){
            System.err.println(e);
        }

        try{
            task2.ArrayIndexOutOfBoundsExceptionTest();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }

        try {
            task2.ArithmeticExceptionTest();
        }
        catch(ArithmeticException e){
            System.err.println(e);
        }

        try {
            task2.ClassCastExceptionTest();
        }
        catch (ClassCastException e){
            System.err.println(e);
        }

        try {
            task2.IOExceptionTest();
        }
        catch(IOException e){
            System.err.println(e);
        }

        try {
            task2.FileNotFoundExceptionTest();
        }
        catch (FileNotFoundException e){
            System.err.println(e);
        }
    }


}
