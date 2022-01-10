package ProjectOOP;

class print{
    public static String divided = "";

    public static void word3(String text) {
        System.out.println(divided);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);

    }

}
public class MyOOP {
    public static void main(String[] args) {
        print.divided = "*******";
        print.word3("I love you");

        print.divided ="////////";
        print.word3("java");
        
    }

    
    
    
}
