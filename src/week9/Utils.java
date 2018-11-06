package week9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {
    private static final String path = "D:\\pathname.txt";
    private static final String path2 = "D:\\pathname2.txt";

    public static String readContentFromFile(String path){
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return content;
    }

    public static void writeContentToFile_B(String path){
        FileWriter f = null;
        BufferedWriter b = null;
        try{
            String data = "\nGhi de du lieu len du lieu cu";
            File file = new File(path);

            if(!file.exists()){
                file.createNewFile();
            }

            f = new FileWriter(file.getAbsoluteFile());
            b = new BufferedWriter(f);
            b.write(data);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(b != null)
                    b.close();
                if(f != null)
                    f.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void writeContentToFile_C(String path){
        FileWriter f = null;
        BufferedWriter b = null;
        try{
            String data = "\nHoc tai Dai hoc Cong nghe";
            File file = new File(path);

            if(!file.exists()){
                file.createNewFile();
            }

            f = new FileWriter(file.getAbsoluteFile(), true);
            b = new BufferedWriter(f);
            b.write(data);

        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try{
                if(b != null)
                    b.close();
                if(f != null)
                    f.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static File findFileByName(String folderPath, String fileName){
        return null;
    }

    public static void main(String[] args) {
        writeContentToFile_B(path2);
        System.out.println(readContentFromFile(path2));
        writeContentToFile_C(path);
        System.out.println(readContentFromFile(path));

    }
}
