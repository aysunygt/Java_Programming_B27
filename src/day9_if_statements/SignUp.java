package day9_if_statements;

import java.util.Scanner;

public class SignUp {
    /*
    signing up to join newsletter
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you full name: ");
        String fullName = input.nextLine();
        System.out.println("Enter your email: ");
        String email = input.nextLine();
        System.out.println("Enter your birthdate: ");
        int age = input.nextInt();
        System.out.println("Do you want to sign up for the extra newsletter? T/F :");
        boolean extra = input.nextBoolean();
        System.out.println("How did you hear about us? ");
        input.nextLine(); // because we are going to use nextLine now we have to use this because we used other methods before using nextLine
        String hearAbout = input.nextLine();

        String confirm = fullName + " you have successfully signed up! \nYour email is: " + email + "\nYour date of birth: " + age + "\nYou signed up for the extra newsletter: " + extra + "\nCredit goes to :" + hearAbout;
        System.out.println(confirm);








    }
}
