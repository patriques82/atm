import account.Account;
import account.CreditAccount;
import account.Option;
import bank.Card;
import account.SavingsAccount;
import bank.Bank;
import bank.BankName;
import bank.NordeaBank;
import bank.SwedBank;

public class Main {

    public static void main(String[] args) {
        Account account1 = new SavingsAccount(123456789, 1000);
        Account[] nordeaAccounts = { account1 };

        Account account2 = new CreditAccount(342528100);
        Account[] swedbankAccounts = { account2 };

        Bank[] banks = { new NordeaBank(nordeaAccounts), new SwedBank(swedbankAccounts) };

	    ATM atm = new ATM(banks);
        Card card = new Card(123456789, "Borat Boratsson", BankName.NORDEA);

        atm.insert(card);
        atm.writePinCode(12345);
        boolean validCard = atm.validate();

        while (true) {
            if (validCard) {
                atm.printOptionsForCard();
                Option option = atm.selectOption();
                atm.processOption(option);
            } else {
                System.out.println("Swallow card");
            }
        }


    }
}
