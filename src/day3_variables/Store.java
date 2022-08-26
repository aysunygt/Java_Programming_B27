package day3_variables;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " jeans in the store"); // concatenates the value of the numberOfItems variables with the characters " jeans in the store"

        numberOfItems = 700; // reassigned the variable into 700, so whenever i use numberOfItems now on it will print 700
        System.out.println(numberOfItems + " jeans left at the end of the day");
        
        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); // soutv

        System.out.println();

        double totalCost = 1_000_000.99; // you can use _ to separate the numbers to be more readable, commas are not valid in java syntax, so we use underscores
        System.out.println(totalCost);

        System.out.println();

        float f = 19.99f; // adding the letter f/F will tell the compiler this is a float number, not a double number.
                            // same with the long l/L

        float f2 = 100; // 100 is int type by default, and int is smaller than float, so there is no problem here
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 100; valid if i wanter
        // float f2 = 100F;
        // float f2 = 100.99F;

        System.out.println();

        long population = 8_000_000_000L; // adding l/L to the number will change the type from in( the default) to a long type, becasue 8 million was too big to be held in an int type
        System.out.println(population);

        long pop2 = 1_000_000; //  is not needed because 1 million is a valid number for int types, and that type can automatically be converted to a bigger number

        System.out.println(pop2);


    }
}
