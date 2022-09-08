package day10_multi_branch_if;

public class CampusTime {
    /*
    create an int value for the time of the day. Use a 24 hour format
    use the given time of day to display a message
    hint:  use separate if statement

        if the hours are from 6-11, print: Good Morning
        if the hours are from 12-16, print: Good Evening
        if the hours are from 17-23, print: Good Night
     */
    public static void main(String[] args) {

        int time = 14;

        if( time >= 6 && time <= 11){
            System.out.println("Good Morning!");
        } else if ( time >=12 && time <= 16){
            System.out.println("Good Evening!");
        } else if ((time >= 17 && time <=23) || (time >= 0 && time <= 5)){
            System.out.println("Good Night!");
        } else {
            System.out.println("Not in 24 hour range");
        }










    }
}
