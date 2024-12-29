/*
 * in a bank, if a customer open a credit car
 * if he/she does not set up the pass word, 
 * the password will be 123456
 */

public class CreditCard{
    private String cardNumber;
    private String passWord;
// user set up the password
    public CreditCard(String cardNumber, String passWord){
        this.cardNumber=cardNumber;
        this.passWord= passWord;
    }
    // set up the default password
    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
        this.passWord="123456";
    }
    public void displayCardInformation(){
        System.out.println("CardNumber: "+ cardNumber);
        System.out.println("Password: "+ passWord);

    }
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("123-456-789","this is pass");
        card1.displayCardInformation();

        CreditCard card2 = new CreditCard("234-567-890");
        card2.displayCardInformation();
    }
}
