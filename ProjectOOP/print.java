package ProjectOOP;

public class print {
    public print(String divided) {
        this.divided = divided;

    }
    public  String divided = "";

    public void word3(String text) {
        System.out.println(this.divided);
        System.out.println(text);
        System.out.println(text);
        System.out.println(text);
    }

    public void reversed3(String text){
        System.out.println(this.divided);
        StringBuffer txt2 = new StringBuffer(text);
        System.out.println(txt2.reverse().toString());
        System.out.println(txt2);
        System.out.println(txt2);


    }



    
}
