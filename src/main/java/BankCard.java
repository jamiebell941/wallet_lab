public abstract class BankCard implements IScan {



    private String cardNumber;
    private String expiryDate;
    private int securityNumber;


    public BankCard( String cardNumber,  String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public String getExpiryDate() {
        return this.expiryDate;
    }

    public int getSecurityNumber() {
        return this.securityNumber;
    }

}
