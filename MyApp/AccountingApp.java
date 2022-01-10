package MyApp;

public class AccountingApp {
    private static double vatRate;
    private static double valueOfSupply;
    private static double vat;
    private static double total;
    private static double expenseRate;
    private static double income;
    private static double expense;

    public static void main(String[] args) {
        
        valueOfSupply = Double.parseDouble(args[0]);
        vatRate = 0.1;
        vat = getVAT();
        total = getTOTAL();
        expenseRate = 0.3;
        income = getINCOME();
        expense = getVAT();
        
        // 배열
        double[] dividendRates = {0.5,0.3,0.2};
        // double[] dividendRates = new double[3];
        // dividendRates[0] = 0.5;
        // dividendRates[1] = 0.3;
        // dividendRates[2] = 0.2;

        
        
        print();
        
        // 반복문

        int i = 0;
        while(i < dividendRates.length) {
            System.out.println("Dividend "+i+" : " + income * dividendRates[i]);
            i = i+1;
        }

    }

    private static double getINCOME() {
        return valueOfSupply*(1-expenseRate);
    }

    private static double getTOTAL() {
        return valueOfSupply*(1+vatRate);
    }

    private static void print() {
        System.out.println("Value of supply : " +valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + income);
    }

    private static double getVAT() {
        return valueOfSupply*vatRate;
    }
    
}
