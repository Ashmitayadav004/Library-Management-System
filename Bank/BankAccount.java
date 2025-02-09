package Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance = 500;

    BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositeMoney(double money) {
        if (money < 0) {
            System.out.println("Invalid deposit");
        } else {
            balance += money;
            System.out.println("Your money is deposited : " + balance);
        }

    }

    public double withdrawMoney(double money) {
        if (money < 0) {
            System.out.println("invalid amount");
        } else if (balance >= money) {
            balance -= money;
        } else {
            money = balance;
            balance = 0;
        }
        return balance;
    }

}