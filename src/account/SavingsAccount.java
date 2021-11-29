package account;

public class SavingsAccount extends Account {
    public SavingsAccount(int accountNr, int amount) {
        super(accountNr, amount);
    }

    public void printOptions() {
        System.out.println("Options for saving:");
        System.out.println("1: withdraw");
        System.out.println("2: insert");
        System.out.println("3: check amount");
    }

    public Option selectOption(int optionNr) {
        if (optionNr == 1) {
            return Option.WITHDRAW;
        } else if (optionNr == 2) {
            return Option.INSERT;
        } else if (optionNr == 3) {
            return Option.CHECKAMOUNT;
        } else {
            return Option.ERROR;
        }
    }

    public void withDraw(int amount) {
        this.amount -= amount;
    }

    public void insert(int amount) {
        this.amount += amount;
    }

    public int checkAmount() {
        return this.amount;
    }

}
