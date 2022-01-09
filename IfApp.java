public class IfApp {
    public static void main(String[] args) {
        
        System.out.println("a");
        
        // if (boolean) {}. 밑줄 쳐지면 데드코드(평생 절대 실행될 일 없음)
        // if(true) {
        //     if (true){
        //         System.out.println(1);
        //     }
        // } else {
        //     System.out.println(23);
        // }
        if (false){
            System.out.println(1);
        } 
        else if(true){
            System.err.println(2);
        } 
        else {
            System.out.println(3);
        }

        System.out.println("b");
    }
}
