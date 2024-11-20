public class TestBankCard{
    public static void main(String[] args){
        SavingCard savingCard = new SavingCard("12345","Alice", 5000, 2000);
        savingCard.checkBalance();
        savingCard.withdraw(1500);

        CreditCard creditCard = new CreditCard("23456","Bob", 0, 10000);
        creditCard.useCreditCard(2000);
        creditCard.repayDebt(1500);
    }
}
