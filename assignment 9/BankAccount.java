// Assignment 9 - Bank Account Interest Rate
// interestRate is static, so every account shares the same rate
// Roll No: 25scs1003001176
public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    static double interestRate = 4.5;

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : " + balance);
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BA1001", "Krishnan", 25000);
        BankAccount account2 = new BankAccount("BA1002", "Aarav", 18000);
        BankAccount account3 = new BankAccount("BA1003", "Meera", 42000);

        System.out.println("Account details before changing interest rate");
        System.out.println("=============================================");
        account1.display();
        account2.display();
        account3.display();

        BankAccount.interestRate = 6.0;

        System.out.println("Interest rate changed using the class name");
        System.out.println("BankAccount.interestRate = 6.0");
        System.out.println();
        System.out.println("Account details after changing interest rate");
        System.out.println("============================================");
        account1.display();
        account2.display();
        account3.display();
    }
}
