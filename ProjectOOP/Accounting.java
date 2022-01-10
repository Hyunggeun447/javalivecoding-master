package ProjectOOP;

public class Accounting {
    // 공급가액
    public static double vatRate = 0.1;
    // 부가가치세율
    public double valueOfsupply;

    // 생성자 생성을 통해 초기 인스턴스 설정에 도움을 줄 수 있다.
    public Accounting(double valueOfSupply){
        this.valueOfsupply = valueOfSupply;
    }

    public double getTotal() {
        double total = valueOfsupply + getVAT();
        return total;
    }

    public double getVAT() {
        double vat = valueOfsupply * vatRate;
        return vat;
    }

    
}
