package day7_operators_andScanners;

public class BuyHouse {
    /*
    declara and assign a credit score variable
    declara and assign a salary

    dtermine if you can get a loan to buy a house
    there is two ways to get a loan
        credit score of 720or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above

     */
    public static void main(String[] args) {

        int creditScore = 720;
        int salary = 100_000;

        boolean option1 = creditScore >= 720 && salary >= 100_000;
        boolean option2 = creditScore >= 740 && salary >= 80_000;

        boolean canGetLoan = option1 || option2;
        System.out.println(canGetLoan);











    }
}
