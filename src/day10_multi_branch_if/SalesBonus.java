package day10_multi_branch_if;

public class SalesBonus {
    /*
    create a sales amount variable
    use the sales amount to determiner the bonus you get at end of the month

    if your sales amount is less than 10000, you don't get any bonus
    if your sales amount is more than or equal to 10000 and less than 15000 you get a bonus of 5000
   if your sales amount is more than or equal to 15000 you get a bonus of 7000

   print your bonus number
     */
    public static void main(String[] args) {

        int sales = 10000;
        int bonus = 0; // we put 0 so you can reassign later

        if(sales >= 10000 && sales < 15000){
            bonus = 5000;
        }

        if(sales >= 15000 ){
            bonus = 7000;
        }

        System.out.println("Sales: " + sales);
        System.out.println("Bonus: " + bonus);









    }
}