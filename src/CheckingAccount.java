public class CheckingAccount extends BankAccount{

    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 2.0;

    public CheckingAccount(){
        transactionCount = 0;
    }

    public CheckingAccount(double initialDeposit){
        transactionCount = 0;
        super.deposit(initialDeposit);
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public static int getFreeTransactions() {
        return FREE_TRANSACTIONS;
    }

    public static double getTransactionFee() {
        return TRANSACTION_FEE;
    }

    public void newTransaction(){
        this.transactionCount ++;
        if(this.transactionCount > this.FREE_TRANSACTIONS){
            deductFees();
        }
    }

    public void deductFees(){
        this.transactionCount = 0;
        double deductAmt = transactionCount * (transactionCount - FREE_TRANSACTIONS);
        super.withdraw(deductAmt);
    }

}
