package ProjectOOP;

public class Accounting {
    // 공급가액
    public static double vatRate = 0.1;
    // 부가가치세율
    public static double valueOfsupply;

    public static double getTotal() {
        double total = valueOfsupply + getVAT();
        return total;
    }

    public static double getVAT() {
        double vat = valueOfsupply * vatRate;
        return vat;
    }

    
}
