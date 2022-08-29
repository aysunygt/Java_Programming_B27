package day6_operators;

public class LogicalExample {
    public static void main(String[] args) {
        System.out.println("&& logic:");
        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp;
        /*
        this is not necessary
            isWeekend == true && isGoodTemp == true;
         */
        System.out.println("Do bbq: " + doBbq); // both of them needs to be true to be true.

        System.out.println();
        System.out.println("|| logic: ");
        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFireFighter = false;
        boolean getDiscount = isTeacher || isPolice || isFireFighter; // || or only one of the boolean need to be true, for the result to be true
        System.out.println("Get a discount; " + getDiscount);

        System.out.println();
        System.out.println("------- and logic && -------");

        // goal: 5 < number < 10

        int number = 8;
        System.out.println(number > 5 && number < 10); // true && true --> true
        System.out.println(number > 0 && number < 5); // true && false --> false

        System.out.println();
        System.out.println("------- or logic || --------");

        int age = 40;
        boolean inValidAge = age < 0 || age > 120; // false || false --> false












    }
}
