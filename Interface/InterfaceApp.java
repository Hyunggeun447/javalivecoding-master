package Interface;


interface Calculable{
    int sum(int v1 , int v2);

    //인터페이스에는 형태 뿐만아니라 변수를 정의할 수 있다.
    double PI = 3.14;
}

interface Printable{
    void print();

}

// interface 를 implements 한 클래스는 그 안에 동일한 명의 메소드를 만들었을 때, 그 형식을 반드시 따라야한다. 이는 협업에 매우 중요하게 사용될 것.

// class cal2 implements Calculable{

//     // 빠른 수정을 통해 implements 한 interface의 메소드를 자동으로 가져올 수 있다.
//     @Override
//     public int sum(int v1, int v2) {
//         // TODO Auto-generated method stub
//         return 0;
//     }
    
// }
                        //한개의 클래스는 여러개의 인터페이스를 받을 수 있다.(여러개의 부모클래스를 상속받지 못하는 반면)
class realCal implements Calculable, Printable{
    public int sum(int v1, int v2){
        return v1+v2;
    }

    public void print() {
        System.out.println("This is RealCal!!");
        
    }

}

public class InterfaceApp {
    public static void main(String[] args) {

        realCal c = new realCal();
        System.out.println(c.sum(10,20));
        c.print();
        System.out.println(c.PI);
        
    }
    
}
