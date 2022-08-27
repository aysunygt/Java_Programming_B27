package day4_variables_cont;

public class CharExample {
    public static void main(String[] args) {

        char upper = 'P';
        char lower = 'e';
        char space = ' ';
        char number = '3';
        char special = '#';

        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("space = " + space);
        System.out.println("number = " + number);
        System.out.println("special = " + special);
        System.out.println();

        char first = 65; // we can do it like this because we can put int into a char and every number is related to a letter...
        // but we can't do '65' because char only hold 1 character.
        System.out.println("A = " + first);
        char second = 66;
        System.out.println("B = " + second);
        char firstLower = 97;
        System.out.println("Lower a  = " +firstLower);







    }
}
