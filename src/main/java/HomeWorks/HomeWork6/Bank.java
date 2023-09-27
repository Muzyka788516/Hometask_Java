package HomeWorks.HomeWork6;

public class Bank {
    private  double Balance;
    public Bank (double StartingBalance){
        this.Balance = StartingBalance;

    }

    public double getBalance() {
        return Balance;
    }
    public int DausUntilAccountsAreCompletelyEmpty(){
        int days = 0;
        while (Balance > 0){
            int MaximumWithdrawalAmount = (int) Balance;
            int AmountForWithdrawal = 1;
            while (AmountForWithdrawal * 2 <= MaximumWithdrawalAmount){

                AmountForWithdrawal *= 2;
            }
            Balance -= AmountForWithdrawal;
            days++;
        }
        return days;
    }

}
