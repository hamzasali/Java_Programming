package day18_garbageCollection;

public class Test_BankAccount {
    public static void main(String[] args) {


        BankAccount account1 = new BankAccount();

        account1.balance = 0;
        account1.accountHolder = "Hamza Ali";
        account1.accountNumber = 32445323;


        account1.deposit(12000);
        account1.checkBalance();
        account1.withdraw(563);
        account1.checkBalance();
        System.out.println(account1);


        System.out.println("---------------------------------");

        BankAccount account2 = new BankAccount();

        System.out.println(account2);
        account2.setInfo("Hamza", 9857429334534L);
        account2.deposit(10000);
        account2.checkBalance();
        account2.withdraw(3402);
        account2.checkBalance();

    }
}
