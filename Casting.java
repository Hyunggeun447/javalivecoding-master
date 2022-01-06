public class Casting {
    public static void main(String[] args) {
        
        double a = 1.1;
        double b  = 1; // 손실이 없기때문에 정수형이라도 double이 가능. 실제로 (double) 1 이라고 보면 된다

        System.out.println(a);
        System.out.println(b);

        // int c = 1.1;
        double d = 1.1;  // int -> double 변환
        int e = (int) 1.1; // 1.1 -> 1 변환 0.1 손실이 생김
        System.out.println(d);
        System.out.println(e);

        String f = Integer.toString(1);  // Integer.toString(숫자)  로 숫자를 문자열로 바꿈
        System.out.println(f.getClass()); // .getClass() : 데이터 타입이 무엇인지 알려줌

    }
    
}
