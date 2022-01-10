// static ==softcopy 같은 느낌. 링크걸려있다. 양쪽의 어떤 값이든 변할 경우 같이 바뀐다.

// no static == hardcopy 같은 느낌. 서로 독립된 별개의 값이 된다.

package ProjectOOP;


class Foo{
    public static String classvar = "i class var";
    public String instanceVar = "I instance var";
    
    public static void classMathod() {
        System.out.println(classvar); //Ok
        // System.out.println(instanceVar); // Error
    }
    public void instanceMethod(){
        System.out.println(classvar); //Ok
        System.out.println(instanceVar); // Ok
    }
}
public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classvar); // Ok
        // System.out.println(Foo.instanceVar); //Error
        Foo.classMathod();
        // Foo.instanceMethod();  // Error

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classvar);
        System.out.println(f1.instanceVar);  //new 로 인스턴스를 불러왔으므로 main메소드에서도 인스턴스를 사용할 수 있다. 

        f1.classvar = "change by f1";
        System.out.println(f1.classvar); // f1에서 classvar를 바꿨고 그 영향으로 Foo의 classvar도 바뀌었고
        System.out.println(f2.classvar); // 그 영향으로 f2의 classvar도 바뀌었따.

        f1.instanceVar = "change by f1";
        System.out.println(f1.instanceVar); // f1에서 instancevar를 바꿨지만 instarcesms 별개이므로 Foo의 instancevar는 그대로
        System.out.println(f2.instanceVar); // 그래서 I instance var 를 출력한다.
        
    }
    
}
