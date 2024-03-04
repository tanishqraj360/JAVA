import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out
                .println(Thread.currentThread().getName() + " deposited " + amount + " into account " + accountNumber);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(
                    Thread.currentThread().getName() + " withdraw " + amount + " from account " + accountNumber);

        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount + " from account "
                    + accountNumber + " but insufficient funds");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}

class Transaction implements Runnable {
    private Account fromAccout;
    private Account toAccount;
    private double amount;

    public Transaction(Account fromAccount, Account toAccount, double amount) {
        this.fromAccout = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public void run() {
        synchronized (fromAccout) {
            synchronized (toAccount) {
                fromAccout.withdraw(amount);
                toAccount.deposit(amount);
            }
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountNumber, accountNumber1;
        double balance, balance1;
        System.out.println("-----------Account Creation----------");
        System.out.println("Enter Account Number: ");
        accountNumber = sc.nextInt();
        System.out.println("Enter Initial Balance: ");
        balance = sc.nextDouble();
        Account account1 = new Account(accountNumber, balance);
        System.out.println();
        System.out.println("-----------Account Creation----------");
        System.out.println("Enter Account Number: ");
        accountNumber1 = sc.nextInt();
        System.out.println("Enter Initial Balance: ");
        balance1 = sc.nextDouble();
        Account account2 = new Account(accountNumber1, balance1);
        System.out.println();

        System.out.println("--------------Transaction--------------");
        Thread thread1 = new Thread(new Transaction(account1, account2, 500));
        Thread thread2 = new Thread(new Transaction(account1, account2, 300));

        thread1.start();
        thread2.start();

        sc.close();
    }
}
