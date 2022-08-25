package day2_print_statements;

public class EscapeExamples {
    /*
    write
    Today is "Friday"
     */
    public static void main(String[] args) {

        System.out.println("Today is \"Friday\""); // this is for to put quotation marks "Friday"
        System.out.println();

        // I want to print a \
        System.out.println("Today is \\Friday\\"); // first \ is syntax , the second \ is the character we want to print
        System.out.println();

        // I want to print '
        System.out.println("Today is \'Friday\'");
        System.out.println();

        // tab sequence
        System.out.println("\tToday \tis \tFriday");
        System.out.println();

        //Next line sequence
        System.out.println("Shopping List; \nApples \nBananas \nBread");
        System.out.println();

        // next line and tab sequences
        System.out.println("Shopping List; \n\tApples \n\tBananas \n\tBread");



    }
}
