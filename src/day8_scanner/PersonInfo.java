package day8_scanner;

import java.util.Scanner;

public class PersonInfo {
    /*
    ask for firstname
    ask for lastname
    ask for address
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name : ");
        String firstName = input.next();
        System.out.println("Please enter your last name : ");
        String lastName = input.next();

        input.nextLine(); // for the enter input yani bunu koymadan diger scanner e gecemiyorsun code just stops

        System.out.println("Please enter your address :");
        String address = input.nextLine();

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);


    }
}
