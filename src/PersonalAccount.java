import java.util.ArrayList;
//ATTRIBUTES
public class PersonalAccount {
    public int accountNumber;
    public String accountHolder;
    public double balance;
    private ArrayList<amount> transactions;

    //constructor
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<amount>();
    }
//A method to deposit money into the account.

    /**
     * This method creates a new Amount object representing the deposit
     *   transaction and adds it to the list of transactions. The account balance
     *   is then updated by adding the specified amount to the current balance
     *  @param amount the amount to be deposited, must be a positive value
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
        }
        amount myAmount1 = new amount(amount, TransactionTypeEnum.DEPOSIT);
        transactions.add(myAmount1);
        this.balance += amount;
    }
//A method to withdraw money from the account

    /**
     *This method creates a new  Amount object representing the withdrawal
     *transaction and adds it to the list of transactions.
     *@param amount if the withdrawal amount is greater than the current balance and greater than 0,
     */
    public void withdraw(double amount) {
        amount myAmount2 = new amount(amount,TransactionTypeEnum.WITHDRAWAL);
        if(amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            transactions.add(myAmount2);
            this.balance -= amount;
        }
    }
    /**A method to print the transaction history of the account*/

    public void printTransactionHistory() {
        System.out.println("Transaction History:");
        for (amount transaction : transactions) {
            System.out.println(transaction);
        }
    }
    /**A method to retrieve the current balance of the account*/
    double getBalance() {
        return this.balance;
    }
    /**A method to retrieve the account number*/
    int getAccountNumber() {
        return this.accountNumber;
    }
    /**A method to retrieve the account holder's name*/
    String getAccountHolder() {
        return this.accountHolder;
    }

}