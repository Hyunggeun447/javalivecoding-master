package ProjectOOP;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
    public static void main(String[] args) throws IOException {

        // class = System, Math, Filewriter
        // instance = f1, f2
        System.out.println(Math.PI);
        System.out.println(Math.floor(1.2));
        System.out.println(Math.ceil(1.2));
        System.out.println(Math.round(1.6));
        
        FileWriter f1 = new FileWriter("data.txt");
        f1.write("Hello");
        f1.write(" java1");
        

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello java2");
        f2.close();

        f1.write("\n");
        f1.write("!!!");
        f1.close();
    }
    
}
