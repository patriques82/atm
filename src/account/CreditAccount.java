package account;

public class CreditAccount extends Account {
    public CreditAccount(int accountNr) {
        super(accountNr, 0);
    }

    public void printOptions() {
        System.out.println("Options for credit:");
        System.out.println("1: take credit loan");
        System.out.println("2: check debt");
    }

    public Option selectOption(int optionNr) {
        if (optionNr == 1) {
            return Option.TAKELOAN;
        } else if (optionNr == 2) {
            return Option.CHECKDEPT;
        } else {
            return Option.ERROR;
        }
    }

    public void takeLoan(int amount) {
        this.amount -= amount;
    }

    public int checkDept() {
        return this.amount;
    }
}
