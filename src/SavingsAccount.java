import java.sql.SQLOutput;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(){
        interestRate = 0;
    }

    public SavingsAccount(double setInterestRate){
        interestRate = setInterestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double intAdd = super.getBalance()*interestRate/100;
        super.deposit(intAdd);
        System.out.println("Interest has been applied to your account. Interest Paid: " + intAdd);
    }

}
