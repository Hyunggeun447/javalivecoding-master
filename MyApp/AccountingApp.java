package MyApp;

public class AccountingApp {
    public static void main(String[] args) {
        
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double vat = valueOfSupply*vatRate;
        double total = valueOfSupply*(1+vatRate);
        double expenseRate = 0.3;
        double imcome = valueOfSupply*(1-expenseRate);
        double expense = valueOfSupply*expenseRate;

        System.out.println("Value of supply : " +valueOfSupply);
        System.out.println("VAT : " + vat);
        System.out.println("Total : " + total);
        System.out.println("Expense : " + expense);
        System.out.println("Income : " + imcome);
        
        System.out.println("Dividend : " + imcome*0.5);
        System.out.println("Dividend : " + imcome*0.3);
        System.out.println("Dividend : " + imcome*0.2);

    }
    
}
