import account.Account;
import bank.Card;

public class Person {
    private Account account;
    private Card card;

    public Person(Account account, Card card) {
        this.account = account;
        this.card = card;
    }
}
