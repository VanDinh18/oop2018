package week10;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static List<String> getAllFunctions(File path){
        String content = null;
        List<String> method = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(path.getAbsolutePath())), StandardCharsets.UTF_8);
            String[] str = content.split("\\n\\n");
            System.out.println(str.length);
            for(String s : str){
                System.out.println(s);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
//        String[] str = content.split("\\n\\n");
//        System.out.println(str.length);
//        for(String s : str){
//            System.out.println(s);
//        }
        return method;
    }

    public static void main(String[] args) {
        String path = "src\\week9\\Utils.java";
        File file = new File(path);
        List<String> list = getAllFunctions(file);
    }
}
