package ProjectOOP;


public class MyOOP {
    public static void main(String[] args) {
        // 클래스명 인스턴스명(생성) = new 클래스명;
        // 인스턴스1.메소드 = ~~1;
        // 인스턴스2.메소드 = ~~2;
        // 각 인스턴스마다 메소드를 따로 저장할 수 있고 그로 인해서 좀더 간결하게 코딩할 수 있다.
        print p1 = new print("----");
        
        p1.word3("asdf");

        print p2 = new print("***********");
        
        p2.word3("java");

        p1.divided=".........";
        p1.reversed3("abcdef");
        p2.reversed3("1234567");


        // print.word3("I love you");

        // print.divided ="////////";
        // print.word3("java");
        
    }

    
    
    
}
