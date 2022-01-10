package ProjectMethod;

import java.lang.reflect.Method;

class print{
    public String delimiter;
    public void a(){                 //public static void 에서 스테틱을 지움
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }
    public void b() {                 //public static void 에서 스테틱을 지움
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }
    public static void c(String delimiter){
        System.out.println(delimiter);
        System.out.println("c");
        System.out.println("c");
    }
    
}
public class staticMethod {
    
    public static void main(String[] args) {
        
        // print.a("=");
        // print.b("*"); // 이 2개는 static 이 있어야함.
        
        // instance
        print t1 = new print();
        t1.delimiter = "-";
        t1.a();
        t1.b();

        print t2 = new print();
        t2.delimiter = "**";
        t2.a();
        t2.b();

        print.c("/*/*/*");

        // print.a("*****");
        // print.b("--");

        // 총평
        // static = clsas Method
        // no static = instance Method
    }

    
    
}
