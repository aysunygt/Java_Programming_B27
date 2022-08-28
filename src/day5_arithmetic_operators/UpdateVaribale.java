package day5_arithmetic_operators;

public class UpdateVaribale {
    public static void main(String[] args) {

        int a = 4;
        System.out.println(a + 10);
       //  a = a + 10; a yi degistirip yazdirmak istiyorsan boyle
        System.out.println(a); // burda sadece a 'yi yazdir diyorsun yani 4 degistirmis olmuyorsun yani a + 10 den sonra.

        a = a + 20;
        System.out.println(a);

        int b = 5;
        b += 30; // this is a short way  to : b = b + 30; quicker way..
        System.out.println(b);




    }
}
