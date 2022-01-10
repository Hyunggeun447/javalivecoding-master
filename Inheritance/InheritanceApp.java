package Inheritance;

class cal{
    public int sum(int v1 , int v2){
        return v1+v2;
    }
}

class cal3 extends cal{
    public int minus(int v1, int v2){
        return v1-v2;
    }

    // Overriding(재정의) : 부모 클래스가 가지고있는 메소드를 새롭게 정의하는 것.
    public int sum(int v1 , int v2){
        System.out.println("cal3!");
        return v1+v2;
    }

}

public class InheritanceApp {
    public static void main(String[] args) {
        cal c = new cal();
        System.out.println(c.sum(2, 1));
        
        cal3 d = new cal3();
        System.out.println(d.minus(10, 2));
        System.out.println(d.sum(10, 2)); // cal3 는 cal로부터 "상속"받아 sum 메소드를 사용할 수 있다.
                                          // 만약 cal이 변경된다면 cal3의 sum 메소드도 변경된다.

    }
    
}

// class cal2{
//     public int sum(int v1 , int v2){
//         return v1+v2;
//     }

//     public int minus(int v1 , int v2){
//         return v1-v2;
//     }
// }