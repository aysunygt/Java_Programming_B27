package day10_multi_branch_if;

public class NumberToDay {
    /*
    create a number to represent the day. -> ( 1 being Monday and 7 being Sunday)
    Print the day related to the number

    Ex:
        2
        Tuesday

    Ex:
        5
        Friday
     */
    public static void main(String[] args) {

        int number = 3;

        if( number == 1){
            System.out.println("Today is Monday!");
        } else if( number == 2){
            System.out.println("Today is Tuesday!");
        } else if ( number == 3){
            System.out.println("Today is Wednesday!");
        } else if( number == 4){
            System.out.println("Today is Thursday!");
        } else if( number == 5){
            System.out.println("Today is Friday!");
        } else if(number == 6){
            System.out.println("Today is Saturday!");
        } else if( number == 7){
            System.out.println("Today is Sunday!");
        } else{
            System.out.println(number + " is an invalid day");
        }











    }
}
