package day6_operators;

import com.sun.security.jgss.GSSUtil;

public class CharIncrement {
    public static void main(String[] args) {

        char letter = 'A';
        System.out.println(letter++); // this one is post increment , bunda ise once bi ele A  yi aliyor sonra digerlerini yazmaya basliyor
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println();

        char letter2 = 'a';
        System.out.println(++letter2); // pre increment, so the 1 is added first, then the expression finishes yani a ya deger verip sonra ki harfi veya sayiyi yaziyor
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);

        System.out.println();

        char digits = '9'; // once 9 a bakip sonra diger sayilari veya harfleri arttiriyor veya azaltiyor
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits--);
        System.out.println(digits); // this is printing the numbers
        System.out.println((int)digits); // cast the character to an int, which mean that is prints the ascii number for that character

        System.out.println();
        System.out.println(65);
        System.out.println((char)65); // we are casting/ transfering 65 into ascii which means into a character









    }
}
