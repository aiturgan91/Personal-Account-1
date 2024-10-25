public class amount {

    //attributes
    private double amount;
    private TransactionTypeEnum transactionType;

    //constructor
    public amount(double amount, TransactionTypeEnum transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }
//getter
    /**Retrieves the amount of the transaction.
     * @return the transaction amount*/
    public double getAmount(){
        return this.amount;
    }
    /**Retrieves the type of the transaction.
     * @return the transaction type, either  DEPOSIT or WITHDRAWAL*/
    public  TransactionTypeEnum getTransactionType(){
        return this.transactionType;
    }
    /**Returns a string representation of the transaction.
     * @return a string representation of the transaction, including the transaction type and amount */
    public String toString(){
        return this.transactionType + ": " + this.amount;
    }
}
