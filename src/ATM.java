import account.Option;
import bank.Card;
import bank.Bank;
import bank.BankName;

import java.util.Scanner;

public class ATM {
    private Bank[] banks; // 0: Nordea, 1: Swedbank
    private Card card;
    private int pinCode;

    public ATM(Bank[] banks) {
        this.banks = banks;
        this.card = null;
        this.pinCode = 0;
    }

    public void insert(Card card) {
        this.card = card;
    }

    public void writePinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    private Bank selectBank() {
        BankName bankName = this.card.getBankName();
        switch (bankName) {
            case NORDEA -> {
                return banks[0];
            }
            case SWEDBANK -> {
                return banks[1];
            }
            default -> {
                return null;
            }
        }
    }

    public boolean validate() {
        Bank bank = selectBank();
        return bank.validate(this.card, this.pinCode);
    }

    public void printOptionsForCard() {
        Bank bank = selectBank();
        bank.printOptions(this.card, this.pinCode);
    }

    public Option selectOption() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int optionNr = Integer.parseInt(input);
        Bank bank = selectBank();
        return bank.selectOption(this.card, this.pinCode, optionNr);
    }

    public void processOption(Option option) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = selectBank();
        switch(option) {
            case WITHDRAW -> {
                System.out.println("How much to withdraw: ");
                String input = scanner.nextLine();
                int amount = Integer.parseInt(input);
                bank.withDraw(this.card, this.pinCode, amount);
            }
            case INSERT -> {
                System.out.println("How much to insert: ");
                String input = scanner.nextLine();
                int amount = Integer.parseInt(input);
                bank.insert(this.card, this.pinCode, amount);
            }
            case CHECKAMOUNT -> {
                int amount = bank.checkAmount(this.card, this.pinCode);
                System.out.println("Amount: " + amount);
            }
            case TAKELOAN -> {
                System.out.println("How much to loan: ");
                String input = scanner.nextLine();
                int amount = Integer.parseInt(input);
                bank.takeLoan(this.card, this.pinCode, amount);
            }
            case CHECKDEPT -> {
                int amount = bank.checkDept(this.card, this.pinCode);
                System.out.println("Amount: " + amount);
            }
            default -> {
                System.out.println("Try again");
            }
        }
    }
}
