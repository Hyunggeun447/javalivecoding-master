package ProjectMethod;

import java.io.FileWriter;
import java.io.IOException;

public class OutputMethod {

    public static String a() {
        //...
        return "a";
    }

    public static int one(){  //여기서 리턴값의 형식을 정해줌
        return 1;   //break; 포함
    }

    public static String twoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter +"\n";
        out = out + text + "\n";
        return out;
    }
    public static void main(String[] args) throws IOException { // void? = 리턴값이 없다!
        
        //System.out.println(a());
        //System.out.println(one());
        System.out.println(twoTimes("a", "-"));
        
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();
        // Email.send("egoinda@nave.com"."two times a", twoTimes("a", "&"));
        
    }
    
}
