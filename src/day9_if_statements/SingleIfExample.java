package day9_if_statements;

public class SingleIfExample {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello"); // when the boolean is true this will run
        }

        System.out.println("break"); // normal print statement, not part of any if code

        if (false) {
            System.out.println("Bye");// the boolean was false, this will NOT run
        }
        System.out.println("-----------------------");

        int year = 2021;

        if (year == 2020 || year == 2021) {
            System.out.println("Stay Home");
            System.out.println("Social distance");
            System.out.println("Wash you hands");
        }
        System.out.println("-----------------------");

        double price = 39.99;

        if (price >= 20) {
            System.out.println("Free Shipping");
        }


    }
}
