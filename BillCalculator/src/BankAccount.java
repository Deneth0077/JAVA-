import java.util.Scanner;


public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //create default constructor
    public BankAccount(){
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;

    }
    // create overload constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Methord to deposit
    public void deposit(double amount){
        balance += amount;
    }

    //Methord to withdrow funds
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("invalid");
        }
    }
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class BankApp{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // Getting user input for account 1
        System.out.println("Enter details for Account 1:");
        System.out.print("Enter account number: ");
        String accNumber1 = scanner.nextLine();
        System.out.print("Enter account holder's name: ");
        String accHolderName1 = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance1 = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        // Getting user input for account 2
        System.out.println("\nEnter details for Account 2:");
        System.out.print("Enter account number: ");
        String accNumber2 = scanner.nextLine();
        System.out.print("Enter account holder's name: ");
        String accHolderName2 = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance2 = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        // Creating BankAccount objects using user inputs
        BankAccount account1 = new BankAccount(accNumber1, accHolderName1, balance1);
        BankAccount account2 = new BankAccount(accNumber2, accHolderName2, balance2);

        // Calling the display method to print details of both accounts
        System.out.println("\nDetails of Account 1:");
        account1.display();

        System.out.println("\nDetails of Account 2:");
        account2.display();

        scanner.close(); // closing the scanner
    }

    }


