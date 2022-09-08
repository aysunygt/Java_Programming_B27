package day10_multi_branch_if;

import javax.management.remote.JMXServerErrorException;
import java.util.Scanner;

public class CampusTime2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a time from 0-23 in 24H format, where 0 is midnight");
        int time = input.nextInt();
        String message = ""; // declaring and assigning a String with value empty space "". Default starting value. yani asagida message yazmak icin kullaniyoruz "" koyuyoruz ki istedigimizi o "" icine yazalim...

        if( time >= 6 && time <= 11){
            message = "Good Morning!";
        } else if ( time >=12 && time <= 16){
            message = "Good afternoon!";
        } else if (time >= 17 && time <=19) {
            message = "Good Evening!";
        } else if ((time >= 20 && time <= 23) || (time >= 0 && time <= 5) ){
            message = "Good night!";
        } else {
            message = "Not in 24 hour range";
        }

        System.out.println(message);





    }
}
