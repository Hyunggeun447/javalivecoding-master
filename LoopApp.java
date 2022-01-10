public class LoopApp {
    public static void main(String[] args) {
        
        System.out.println(1);

        System.out.println("-----------while------------");
        int i = 0;

        while(i<3) {
            System.out.println(2);
            System.out.println(3);
            i++;
        }

        System.out.println("i = "+i);
        System.out.println("------for------");
        for(int j=0; j<10; j++){
            System.out.println(j);
        }
        System.out.println("-----------end----------");
        System.out.println(4);
    }
    
}
