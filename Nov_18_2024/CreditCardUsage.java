/*
 * record the credit card usage
 * static variable practice
 * this task involves keeping tracking the total number of transcations and 
 * the toal amount spent using a credit card. Each transactions should
 * display the transaction amount, and the total number of transcations and the total amount spendt
 * should also be display
 */

public class CreditCardUsage{
    private static int totalTransactions = 0;
    private static double totalAmountSpent =0;

    public static void recordTransaction(double transactionAmount){
        totalTransactions++;
        totalAmountSpent+=transactionAmount;
        System.out.println("You hava a transction and the amount is $ "+ transactionAmount);
    }
    public static void displaySummary(){
        System.out.println("The total transactions is "+ totalTransactions);
        System.out.println("The total amount spent is $"+ totalAmountSpent);
    }
    
    public static void main(String[] args) {
        recordTransaction(100);
        recordTransaction(40);
        recordTransaction(25);
        recordTransaction(10);
        displaySummary();
    }

}
