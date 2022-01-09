public class ComparisonOperatorApp {
    public static void main(String[] args) {
        
        System.out.println(1>1); //false
        System.out.println(12 != 11); //true
        System.out.println(1<1); 
        System.out.println(1>=1); 
        System.out.println(1<=1); 

        int x = 1;
        int y = 3;

        System.out.println(x==(x=y)); // false
        x=1; // reset
        System.out.println((x = y) == x); // true
        // x = y 가 먼저 실행됨면서 뒤의 x도 변환되기 때문에 true가 출력된다.
        


    }
}
