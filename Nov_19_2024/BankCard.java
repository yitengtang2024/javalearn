/*
 * create a bankcard public class BankCard {
    credit card and debit card are the child class of it
 }
 */
class BankCard{
    String cardNumber;
    String holderName;
    double balance;

    public BankCard(String cardNumber, String holderName, double balance){
        this.cardNumber=cardNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public void checkBalance(){
        System.out.println("The balance is "+ balance);
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposition: "+amount);
    }
    public void withdraw(double amount){
        if(balance>amount){
            balance-=amount;
            System.out.println("withdraw:"+amount);
        }else{
            System.out.println("Not enough balance!");
        }
    }
}
class CreditCard extends BankCard{
    double creditLimit;
    double debt;
    public CreditCard(String cardNumber,String holderName, double balance, double creditLimit){
        super(cardNumber, holderName, balance);
        this.creditLimit=creditLimit;
        this.debt=0;
    }
    public void useCreditCard(double amount){
        if(amount>(creditLimit-debt)){
            System.out.println("Out of balance!");
        }else{
            debt+=amount;
            System.out.println("credit used:"+amount);
        }
    }
    public void repayDebt(double amount){
        if(amount>debt){
            System.out.println("Overpay happened!");
        }else{
            debt-=amount;
            System.out.println("Debt paid:"+amount);
        }
    }
    
}
class SavingCard extends BankCard{
    double dailyLimit;
    public SavingCard(String cardNumber, String holderName, double balance, double dailyLimit){
        super(cardNumber,holderName,balance);
        this.dailyLimit=dailyLimit;
    }
    @Override
    public void withdraw(double amount){
        if (amount>dailyLimit){
            System.out.println("this amount greater than dailyLimit!");
        }else{
            super.withdraw(amount);
        }
    }
}

