package bank;

import account.Account;
import account.Option;

public class Bank {
    private Account[] accounts;

    public Bank() {
        this.accounts = new Account[0];
    }

    public Bank(Account[] accounts) {
        this.accounts = accounts;
    }

    public boolean validate(Card card, int pinCode) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                return true;
            }
        }
        return false;
    }

    public void printOptions(Card card, int pinCode) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                account.printOptions();
            }
        }
    }

    public Option selectOption(Card card, int pinCode, int optionNr) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                return account.selectOption(optionNr);
            }
        }
        return Option.ERROR;
    }

    public void withDraw(Card card, int pinCode, int amount) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                account.withDraw(amount);
            }
        }
    }

    public void insert(Card card, int pinCode, int amount) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                account.insert(amount);
            }
        }
    }

    public int checkAmount(Card card, int pinCode) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                return account.checkAmount();
            }
        }
        return 0;
    }

    public void takeLoan(Card card, int pinCode, int amount) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                account.takeLoan(amount);
            }
        }
    }

    public int checkDept(Card card, int pinCode) {
        for (Account account : accounts) {
            if (account.getAccountNr() == card.getAccountNr()) {
                return account.checkDept();
            }
        }
        return 0;
    }
}
