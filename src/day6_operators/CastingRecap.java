package day6_operators;

public class CastingRecap {
    public static void main(String[] args) {

        int age = 26;
        long ageLong = age;

        long num = 100;
        int numInt = (int) num;

        long boxes = 300000000000L;

        float f = 14.5F; // added F to make the number a float type
        int i = (int)f;
        System.out.println(i);
        double d = f; // float going to double
        System.out.println(d);
        double d2 = i; // int going to double
        System.out.println(d2);







    }
}
