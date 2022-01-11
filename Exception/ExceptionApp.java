package Exception;

import java.lang.reflect.Array;

public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println(1);

        int[] scores = {10,20,30};
        try{
            System.out.println(scores[3]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 범위에 없습니다.");
        }

        try{
            System.out.println(2/0); // 예외상황 발생
        } catch(ArithmeticException e){
            System.out.println("산술적 오류 발생");
        }

        // try{
        //     System.out.println(2);
        //     System.out.println(2/0);
        //     System.out.println(3);
        //     System.out.println(scores[3]);
        //     System.out.println(4);
        // } catch(ArithmeticException e){
        //     System.out.println("산술적 오류 발생");
        // } catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("배열에 없는 값");
        // }


        System.out.println(5);
    }
    
}
