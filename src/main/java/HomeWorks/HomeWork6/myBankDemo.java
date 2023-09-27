package HomeWorks.HomeWork6;

public class myBankDemo {
    public static void main(String[] args) {
        double StartingBalance = 21.0;

        Bank myBank = new Bank(StartingBalance);

        int days = myBank.DausUntilAccountsAreCompletelyEmpty();

        System.out.println("Изначальный баланс: " + StartingBalance);
        System.out.println("Для снятия всех денег нужно " + days +  " " + " дней");
        }
    }

