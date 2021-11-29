package bank;

public class Card {
    private int accountNr;
    private String cardHolderName;
    private BankName bankName;

    public Card(int cardNr, String cardHolderName, BankName bankName) {
        this.accountNr = cardNr;
        this.cardHolderName = cardHolderName;
        this.bankName = bankName;
    }

    public BankName getBankName() {
        return bankName;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }
}
