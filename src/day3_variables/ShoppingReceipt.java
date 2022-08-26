package day3_variables;

import java.sql.SQLOutput;

public class ShoppingReceipt {
    /*
    Shopping receipt

    Create a class called ShoppingReceipt
    Create a main method
    Print the following:

    ****************************
        WELCOME TO THE STORE
    ****************************

    ----------------------------

    CAKE                $24
    WATER               $3.99
    APPLE JUICE         $7.50
    BREAD               $4.25

    ---------------------------
    TOTAL AMOUNT:       $ 39.74
    TAX:                $3.90

    GRAND TOTAL:        $ 43.64
    ---------------------------

    ***************************
            THANK YOU
    ***************************

     */
    public static void main(String[] args){
        String star = "*******************************";
        String welcome = "    WELCOME TO THE STORE";
        double beforeTax = 39.74;
        double tax = 3.90;
        float totalAfterTax = 43.64f;

        System.out.println(star);
        System.out.println(welcome);
        System.out.println(star);

        System.out.println();

        System.out.println("------------------------------");
        System.out.println();

        System.out.println("Cake\t\t\t$24\nWater\t\t\t$3.90\nApple Juice\t\t$7.50\nBread\t\t\t$4.25");
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("TOTAL AMOUNT:\t$" + beforeTax + "\nTAX:\t\t\t$" + tax + "\n\nGRAND TOTAL:\t$" + totalAfterTax);
        System.out.println("------------------------------");
        System.out.println("********* THANK YOU **********");





    }
}
