package day6_operators;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 0;
        double price = 0.0;

        System.out.println("Go and pick up some coffee ");
        System.out.println("Items in the cart: " + ++numberOfItems); // if we just write numberOfItems it will just be 0 so we need pre increment
        price += 3.55; // price = price + 3.55     -- 0 olan price a 3.55 ekledik

        System.out.println("Go pick up some milk ");
        System.out.println("add 1 gallon of milk " + ++numberOfItems);
        System.out.println("add 1 gallon of milk " + ++numberOfItems);
        price += 5.99; // price = price + 5.99     --  sonra 3.55 olan price a 5.99 ekledik

        System.out.println("Your total is $" + price); // sonuc ikisinin toplami oldu












    }
}
