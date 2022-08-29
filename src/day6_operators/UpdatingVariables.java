package day6_operators;

public class UpdatingVariables {
    public static void main(String[] args) {

        int n = 10;

        // reassign a new value
        n = 20;

        int a = 3;
        a = a + 4; // a + 4 -> 3 + 4 = 7 gets stored as the new value for a

        int b = 15;
        b += 9 ; // b = b + 9;
        b += 1; // b = b + 1;

        int z = 10;
        z++;
        /*
        updating a number by 1:

                z = 11;
                or
                z = z +1;
                or
                z += 1;
                or
                z++;
         */
        System.out.println();

        int java = 8;
        int testing = --java; // pre decrement

        System.out.println(java); // 8 -- 7
        System.out.println(testing); // 7

        System.out.println();

        int x = 7;
        int y = x--; // post decrement

        System.out.println(x); // 7 --> 6 -- cunku x 6 dusmus oldu
        System.out.println(); // 7 ama bu hala 7 cunku tekrarliyor sonra ceviriyor







    }
}
