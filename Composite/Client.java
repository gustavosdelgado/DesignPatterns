package Composite;

public class Client {

    public static void main(String[] args) {
        CompositeAccount component = new CompositeAccount();

        component.addAccount(new DepositAccount());
        component.addAccount(new SavingAccount());

        System.out.println("Total balance: " + component.getBalance());
    }
}
