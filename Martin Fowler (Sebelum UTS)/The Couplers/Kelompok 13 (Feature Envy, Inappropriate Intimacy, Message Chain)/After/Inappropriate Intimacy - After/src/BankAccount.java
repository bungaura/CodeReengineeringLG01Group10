public class BankAccount {
	
    private String accountNumber;
    private double balance;
    private Customer owner;

    public BankAccount(String accountNumber, double balance, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Owner: " + owner.getName());
    }
}

/*
KELOMPOK 10 LG01
2502005912 - Emmanuel Clement
2502016475 - Haliza Syafa Oktaviani
2502024382 - Bunga Aura Prameswari

Inappropriate Intimacy Treatment:
- Mengubah fields dalam class "Customer.java" dari public ke private
- Membuat setter dan getter untuk class "Customer.java"
*/
