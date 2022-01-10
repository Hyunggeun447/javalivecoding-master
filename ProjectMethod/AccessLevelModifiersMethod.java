package ProjectMethod;

class Greeting{
    //public, protected, default, private
    public static void hi() {
        System.out.println("Hi~~~~");
    }
}

public class AccessLevelModifiersMethod {
    public static void main(String[] args) {
        Greeting.hi();
    }
    //class 가 다르면 public 은 가능, private 은 불가능.
}
