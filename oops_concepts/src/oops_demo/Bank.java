package oops_demo;

class BankAccount {
    String accountNo;
    double balance;

    BankAccount(String acc, double bal) {
        accountNo = acc;
        balance = bal;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt > balance)
            System.out.println("Insufficient Balance");
        else {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest Added");
    }
}

class SalaryAccount extends BankAccount {
    double monthlySalary;

    SalaryAccount(String acc, double bal, double sal) {
        super(acc, bal);
        monthlySalary = sal;
    }

    void creditSalary() {
        balance += monthlySalary;
        System.out.println("Salary Credited");
    }
}

public class Bank {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("SA01", 5000, 5);
        s.deposit(1000);
        s.addInterest();
        s.withdraw(2000);
        System.out.println("Savings Balance: " + s.balance);

        SalaryAccount sa = new SalaryAccount("SL01", 2000, 25000);
        sa.creditSalary();
        sa.withdraw(5000);
        System.out.println("Salary Balance: " + sa.balance);
    }
}
