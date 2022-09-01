package day8_scanner;

import java.util.Scanner;

public class EmployeeReport {
    /*
    full name
    job title
    salary
    company hq

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("What is your hourly rate: ");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the average number of hours in a week:");
        int hours = input.nextInt();

        double salary = hours * 52 * hourlyRate; // 52 weeks in a year

        System.out.println("Where is the company HQ: ");
        input.nextLine(); // empty one to catch the enter input  yagggni nextline kullanirken ondan once kullanigin methoda bak eger farkliysa bunu koymak zorundasin kodun devam etmesi icin
        String hqLocation = input.nextLine();

        System.out.println("Are you full: true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + " is a " + jobTitle + " they make " + salary + " because they are fulltime: " + isFullTime + ". The Hq is located in: " + hqLocation;

        System.out.println(report);







    }
}
