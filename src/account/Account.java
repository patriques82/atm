package account;

public class Account {
    protected int accountNr;
    protected int amount;

    public Account(int accountNr, int amount) {
        this.accountNr = accountNr;
        this.amount = amount;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public void printOptions() {
    }

    public Option selectOption(int optionNr) {
        return null;
    }

    public void withDraw(int amount) {

    }

    public void insert(int amount) {

    }

    public int checkAmount() {
        return 0;
    }

    public void takeLoan(int amount) {

    }

    public int checkDept() {
        return 0;
    }
}
