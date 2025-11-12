import java.util.Scanner;


class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected double balance;

   
    public Account(String customerName, String accountNumber, String accountType, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            displayBalance();
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }
}


class SavAcct extends Account {
    private final double interestRate = 0.05; 

    public SavAcct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Savings", initialBalance);
    }


    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added.");
        displayBalance();
    }
}


class CurAcct extends Account {
    private final double minBalance = 1000.0;
    private final double penalty = 100.0;

    public CurAcct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }

  
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            checkMinBalance();
            displayBalance();
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    
    public void checkMinBalance() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Balance below minimum. Penalty of " + penalty + " imposed.");
        }
    }
}


public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = sc.nextLine();

        System.out.println("Enter account number:");
        String accNo = sc.nextLine();

        System.out.println("Enter account type (savings/current):");
        String type = sc.nextLine().toLowerCase();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        Account account;
        if (type.equals("savings")) {
            account = new SavAcct(name, accNo, balance);
        } else {
            account = new CurAcct(name, accNo, balance);
        }

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            if (account instanceof SavAcct)
                System.out.println("4. Compute and Deposit Interest");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    if (account instanceof SavAcct)
                        ((SavAcct) account).computeAndDepositInterest();
                    else
                        System.out.println("Interest not applicable for current account!");
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
