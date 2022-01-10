package ProjectMethod;

public class AcoountingApp {
    // 공급가액
    public static double vatRate = 0.1;
    // 부가가치세율
    private static double valueOfsupply = 10000.0;

    public static void main(String[] args) {
        
        System.out.println("Value of supply = " + valueOfsupply);
        System.out.println("VAT = "+ getVAT());
        System.out.println("Total = "+ getTotal());
    }

    public static double getTotal() {
        double total = valueOfsupply + getVAT();
        return total;
    }

    public static double getVAT() {
        double vat = valueOfsupply * vatRate;
        return vat;
    }
    
}
