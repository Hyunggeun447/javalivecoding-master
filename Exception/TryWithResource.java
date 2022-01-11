package Exception;

import java.io.FileWriter;

public class TryWithResource {
    public static void main(String[] args) {
        try(FileWriter f = new FileWriter("text21.txt")){
            f.write("뭐가문제야");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
