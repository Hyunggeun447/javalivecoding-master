package Interface;


interface calculabe{
    int sum(int v1 , int v2);
}

// interface 를 implements 한 클래스는 그 안에 동일한 명의 메소드를 만들었을 때, 그 형식을 반드시 따라야한다. 이는 협업에 매우 중요하게 사용될 것.

class cal2 implements calculabe{

    // 빠른 수정을 통해 implements 한 interface의 메소드를 자동으로 가져올 수 있다.
    @Override
    public int sum(int v1, int v2) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}

class realCal implements calculabe{
    public int sum(int v1, int v2){
        return v1+v2;
    }

}

public class InterfaceApp {
    public static void main(String[] args) {

        realCal c = new realCal();
        System.out.println(c.sum(10,20));
        
    }
    
}
