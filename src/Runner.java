public class Runner {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(.02);
        account.setBalance(1000);
        System.out.println(account.getBalance());

        CheckingAccount chk = new CheckingAccount(7800);
        System.out.println(chk.getBalance());

    }

}
