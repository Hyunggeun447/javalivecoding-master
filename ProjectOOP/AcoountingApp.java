package ProjectOOP;


public class AcoountingApp {

    public static void main(String[] args) {
        //클레스의 상태가 자주 변화하는 상황이 온다면 인스턴스가 유리
        
        
        // 생성자 생성 전
        // Accounting a1 = new Accounting();
        // Accounting a2 = new Accounting();
        // a1.valueOfsupply = 10000.0;
        // a2.valueOfsupply = 20000.0;

        //생성자 생성 후
        Accounting a1 = new Accounting(10000.0);
        Accounting a2 = new Accounting(20000.0);
        
        

        
        System.out.println("Value of supply = " + a1.valueOfsupply);
        System.out.println("VAT = "+ a2.getVAT()); // valueOfsupply = 20000.0
        System.out.println("Total = "+ a1.getTotal());

        System.out.println("-------------절취선-------------");
        
        System.out.println("Value of supply = " + a2.valueOfsupply);
        System.out.println("VAT = "+ a1.getVAT());  // valueOfsupply = 10000.0
        System.out.println("Total = "+ a2.getTotal());

        // 클래스라면 valueOfSupply 가 10000일때와 20000일때가 섞였다면
        // 표현방식이 매우 복잡해질 것이다.
        // 매번 Accounting.valueOfSupply 값을 변화시켜줘야하기때문.
        // 이럴 경우 인스턴스로 표현한다면 매우 편해진다.
    }

    
    
}