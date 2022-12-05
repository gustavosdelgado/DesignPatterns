package Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount extends Account {

    private List<Account> accountList = new ArrayList<>();

    @Override
    public float getBalance() {
        float totalBalance = 0;
        for (Account a :
                accountList) {
            totalBalance += a.getBalance();
        }
        return totalBalance;
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }
}
