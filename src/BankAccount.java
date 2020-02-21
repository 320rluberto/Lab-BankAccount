public class BankAccount {

    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        balance =+ depositAmount;
    }

    public String withdraw(double withdrawAmount){
        if(withdrawAmount > balance) {
            return "Insufficient funds";
        }
        balance -= withdrawAmount;
        return "Your withdraw has been successful. Your new balance is $" + balance;
    }

    public void transfer(double transferAmount, BankAccount transferToAccount){
        if(transferAmount > balance){
            System.out.println("Insufficient funds");
        }
        else{
            transferToAccount.deposit(transferAmount);
            withdraw(transferAmount);
            System.out.println("Your transfer has been successful. This accounts new balance is $" + balance);
        }
    }

}
