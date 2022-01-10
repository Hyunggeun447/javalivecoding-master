public class LoopArray {
    public static void main(String[] args) {
        
        String[] users ={"egoing","jinhuck","youbin"};

        for(int i=0; i<users.length; i++){
            if(i!=users.length-1){
                System.out.println(users[i]+",");
            } else{
                System.out.println(users[i]+".");
            }
            
        }
    }
    
}
