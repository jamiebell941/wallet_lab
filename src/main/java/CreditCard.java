public class CreditCard extends BankCard implements IScan{

    public CreditCard(String cardNumber, int securityNumber, String expiryDate) {
        super(cardNumber, expiryDate, securityNumber);
    }


    public String scan() {
        return "Payment Successful";
    }
}
