package Inheritance;

class cal{
    public int sum(int v1 , int v2){
        return v1+v2;
    }
}

class cal3 extends cal{
    public int minus(int v1, int v2){
        return v1-v2;
    }

}

public class InheritanceApp {
    public static void main(String[] args) {
        cal c = new cal();
        System.out.println(c.sum(2, 1));
        
        cal3 d = new cal3();
        System.out.println(d.minus(10, 2));
        System.out.println(d.sum(10, 2));

    }
    
}

// class cal2{
//     public int sum(int v1 , int v2){
//         return v1+v2;
//     }

//     public int minus(int v1 , int v2){
//         return v1-v2;
//     }
// }