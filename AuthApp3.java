public class AuthApp3 {
    public static void main(String[] args) {
        
        // String[] users = {"egoing","jinhuck","youbin"};
        // 2차원 배열
        String[][] users = {
            {"egoing","1111"},
            {"jinhuck","2222"},
            {"youbin","3333"}
        };


        String inputId = args[0];
        String inputPass = args[1];

        boolean isLogined = false;
        for(int i=0; i<users.length; i++){
            // System.out.println(users[i]);
            String currentId = users[i][0];
            String currentPass = users[i][1];

            if(
                currentId.equals(inputId) &&
                currentPass.equals(inputPass)
            ){
                isLogined = true;
                break;
            }
        }
        System.out.println("Hi");
        if(isLogined){
            System.out.println("Master!");
        } else{
            System.out.println("who are you?");
        }
    }
    
}
