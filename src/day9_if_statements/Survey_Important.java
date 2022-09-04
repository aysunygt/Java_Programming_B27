package day9_if_statements;

import java.util.Scanner;

public class Survey_Important {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Are you a Student? T/F ");
        boolean isStudent = input.nextBoolean();
        String report = ""; // empty space, String type

        if(isStudent){
            System.out.println("What are you studying?");
            String subject = input.next();
            report += "Studying " + subject;  //sout yerine string report yaptik yani orda ki "" bu sey altinda yeri doldurmak icin..
        }

        System.out.println("Do you live in a city? T/F");
        // boolean inCity = input.nextBoolean   --> we can do it like this
        // if(inCity)
        if(input.nextBoolean()){ //  using the boolean from Scanner right away instead of storing into a boolean variable
            System.out.println("Cool, cities are loud and fun");
        } else {
            System.out.println("How many years have you lived in the suburb? ");
            int years = input.nextInt();
            input.nextLine();
            report += "\nLiving in suburb for " + years + "years";
        }
        System.out.println(report);

    }
}

/*
 */