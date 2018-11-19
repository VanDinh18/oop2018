package week10;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static List<String> getAllFunctions(File path){
        String content = null;
        List<String> method = new ArrayList<>();
        try {
            content = new String(Files.readAllBytes(Paths.get(path.getAbsolutePath())), StandardCharsets.UTF_8);
        }
        catch(IOException e){
            e.printStackTrace();
        }

        String[] str = content.split("//");
        for(String s : str){
            if(s.trim().contains("public static")){
                method.add(s);
            }
        }
        return method;
    }

    public static String findFunctionByName(String name){

        return null;
    }

    public static void main(String[] args) {
        String path = "src\\week9\\Utils.java";
        File file = new File(path);
        List<String> list = getAllFunctions(file);
        findFunctionByName("findFileByName(String,String)");
    }
}

/*
package week10;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Task1 {
    static boolean sub(String str,int n) {
        if(str == null)
            return false;
        String sta = "public static";
        if(str.length() - n < sta.length())
            return false;
        for(int i = n ,j = 0;j < sta.length(); i++,j++) {
            if(str.charAt(i)!=sta.charAt(j))
                return false;
        }

        return true;
    }
    static int poisionStatic(String str){
        if(str == null)
            return -1;
        for(int i = 0; i < str.length();i++) {
            if(sub(str,i))
                return i;
        }
        return -1;
    }
    static public List<String>getAllFunctions(File path)  {
        List<String> list = new ArrayList<String>();
        String funcion = "";
        String line = "";
        int index = -1;
        int check = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));

            while(br.ready()){
                line = br.readLine();
                if(index == -1)
                    index = poisionStatic(line);
                if(check > 0) {
                    funcion+=line;
                    funcion+="\n";
                    if(line.endsWith("{")) {
                        check ++;
                    }
                    if(line.endsWith("}"))
                        check --;
                    if(check == 0){
                        index = -1;
                        list.add(funcion);
                        funcion  = "";
                        //System.out.println(funcion); //funcion  = "";
                    }
                }
                if(index >= 0 && check == 0){
                    if(line.endsWith("{")){
                        check++;
                        funcion += line;
                        funcion +="\n";
                    }
                }
            }
//            System.out.println(funcion);
        }
        catch( IOException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    static public String findFunctionByName(String name) {
        return "";
    }
    public static void main(String[] args) throws FileNotFoundException {
        File path = new File("src\\week9\\Utils.java");
        List<String> list = getAllFunctions(path);
        for( String st: list) {
            System.out.println(st);
        }


    }
}
*/