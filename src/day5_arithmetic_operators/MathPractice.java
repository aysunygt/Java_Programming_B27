package day5_arithmetic_operators;

public class MathPractice {
    public static void main(String[] args) {

        System.out.println(4 + 5);
        System.out.println(4 * 5);

        // int * int
        System.out.println(2 * 5);

        // int * double -> result is double  ------ so in java, when you use small type to divide or multiply or add whatever with a bigger type the result will be the bigger type
        System.out.println(2 * 5.5);

        //  int / int -> int
        System.out.println( 10 / 3 ); // the result is actually 3.33 whatever but it is int type so it will only give 3

        // int / double -> double
        System.out.println( 10 / 3.0);


        System.out.println( 5 % 2); // 2 + 2 -> 2 went into 5 twice, there is one left over

        System.out.println( 4 % 2); // the result is 0 because there is no left over 2 divides into 4 even
        System.out.println( 6 % 2); // still 0 no remainder no left over

        System.out.println( 4 % 10); // the result is 4 because you can't put 4 into 10 .. 4/10 not enough to have a whole number 10, 4 is the left over







    }
}
