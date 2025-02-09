package Bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123", "Priya");
        acc1.depositeMoney(1000);
        System.out.println("Withdraw " + acc1.withdrawMoney(235));
        acc1.depositeMoney(-1000);
        System.out.println("Withdraw " + acc1.withdrawMoney(-44567));
        acc1.depositeMoney(10000);
        System.out.println("Withdraw " + acc1.withdrawMoney(2345));

    }
}
