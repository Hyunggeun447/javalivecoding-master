package ProjectOOP;


public class AcoountingApp {

    public static void main(String[] args) {

        Accounting.valueOfsupply = 10000.0;
        
        System.out.println("Value of supply = " + Accounting.valueOfsupply);
        System.out.println("VAT = "+ Accounting.getVAT());
        System.out.println("Total = "+ Accounting.getTotal());
    }

    
    
}