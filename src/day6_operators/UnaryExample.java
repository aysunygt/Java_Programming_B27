package day6_operators;

public class UnaryExample {
    public static void main(String[] args) {

        int n = 0; // 0
        n++;       // post increment, value becomes 1
        System.out.println(n); // will be 1
        ++n;        // pre increment, value becomes 2
        System.out.println(n);// will be 2

        System.out.println(++n); // pre increment, value becomes 3, then it prints the value

        System.out.println(++n); // pre increment, value becomes 4, then it prints the value

        System.out.println(n);
        System.out.println("Post number");
        System.out.println(n++); // post increment , which mean it will repeat itself first, then it will increment by 1

        System.out.println(n);
        System.out.println();

        int x = 4;
        int y = x;
        int z = ++x; // pre increment
        System.out.println("x " + x); // 4 --> became 5 because we did ++x
        System.out.println("y " + y); // 4 because we put e into y
        System.out.println("z " + z); // and we made a third value that we assigned to be the same as x

        System.out.println();

        int candy = 5;
        System.out.println("Your kid asks for a candy, you have " + candy);
        System.out.println("Your give them 1, so now you have " + --candy); // pre decrement, subtract 1 first, then print it
        System.out.println("The sibling comes in and they want 1 too so first you check how many was left! " + candy-- + " is whats left."); // post decrement
        System.out.println("You checked and there was 4 left, so you give him/her 1.. Total candy in jar now " + candy);

        // USE CASE: counting;
        // you name, we want to find how many times your name has the letter 'a'

        int counter = 0;
        counter++;
        // we find another a
        counter++;





    }
}
