package day10_multi_branch_if;

import java.util.Scanner;

public class DaysInMonths {
    /*
    create a int variable to represent the month number, where 1 is January and 12 is December

    use the month number input to determine how many days are in that month.
    use the following data to help you determine the number of days in each month:

    Month that has 31 days: 1, 3, 5, 7, 8, 10, 12
    Months that has 30 days: 4, 6, 9, 11
    Months that has 28 days: 2

    Ex:
        12
        31 Days

   Ex:
        9
        30 Days
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number from 1 - 12");
        int month = input.nextInt();
        int days = 0; // this days will be changed later on

        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        // multi branch is determine the number of days in each month

        if(has31Days){
            days = 31;
        } else if (has30Days){
            days = 30;
        } else if ( month == 2){
            days = 28;
        }

        // determine the output of my program

        if(days > 0){
            System.out.println("Month: " + month);
            System.out.println("Days in the month: " + days);
        } else{
            System.out.println(month + " is not a valid data");
        }












    }
}
