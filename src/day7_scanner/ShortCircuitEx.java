package day7_scanner;

public class ShortCircuitEx {
    public static void main(String[] args) {

        System.out.println(true && true); // true
        System.out.println(false && true); // false
        // System.out.println(5/0); -> you cannot divide by 0

        // System.out.println(true && 5/0 == 0);  -> error
        System.out.println(false && 5/0 == 0);
        // System.out.println(false & 5/0 == 0 ); // & is the same as && but in the future it will not be the same so!

        System.out.println(true || false);

        int count = 0;
        System.out.println(true || count++ == 1);
        System.out.println(count);





    }
}
