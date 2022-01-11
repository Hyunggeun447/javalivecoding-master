package Inheritance;

class cal{

    //생성자 만듬
    int v1, v2;
    cal(int v1, int v2){
        System.out.println("cal init");
        this.v1 = v1;
        this.v2 = v2;
    }

    public int sum(){
        return v1+v2;
    }

    // // overloading
    // public int sum(int v1 , int v2, int v3){
    //     return this.sum(v1,v2)+v3;
    // }
}

class cal3 extends cal{
    //부모 클래스에서 생성자가 생길 경우, 자식클래스에서도 생성자를 만들어줘야한다. 이 경우 super을 이용하여 v1, v2를 만들어주었다.
    cal3(int v1, int v2) {
        super(v1, v2);
        System.out.println("여기는 cal3");
        //TODO Auto-generated constructor stub
    }

    public int minus(){
        return v1-v2;
    }

    // Overriding(재정의) : 부모 클래스가 가지고있는 메소드를 새롭게 정의하는 것.
    public int sum(){
        System.out.println("cal3!");
        return super.sum();
    }

    // 상속받은 클래스에서도 overloading 역시 가능.  if cal sum (v1,v2,v3) 가 없다면.
    // public int sum(int v1 , int v2, int v3){
    //     return v1+v2+v3;

}

public class InheritanceApp {
    public static void main(String[] args) {
        cal c = new cal(3,4);
        System.out.println(c.sum());
        System.out.println(c.sum());

        cal3 d = new cal3(5,6);
        System.out.println(d.minus());
        System.out.println(d.sum()); // cal3 는 cal로부터 "상속"받아 sum 메소드를 사용할 수 있다.
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