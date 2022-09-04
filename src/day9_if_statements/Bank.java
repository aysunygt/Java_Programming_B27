package day9_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountWithdraw = 500_000;

        balance -= amountWithdraw; // balance = balance - amountWithdraw;
        System.out.println("Withdrew: " + amountWithdraw);

        if(balance >= 0 ){
            System.out.println("Account balance is: " + balance);
        }

        if(balance < 0 ){
            System.out.println("Overdraft Penalty");
            System.out.println("Amount due: " + amountWithdraw * 0.25);

        }









    }
}
