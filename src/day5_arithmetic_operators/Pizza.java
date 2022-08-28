package day5_arithmetic_operators;

public class Pizza {
    public static void main(String[] args) {

        String type = "Cheese";
        int pizzaSlices = 10;
        int people = 3;
        int slicesPerPerson = pizzaSlices / people;
        int leftOverSlices = pizzaSlices % people;
        System.out.println(people + " are going to eat the " + type + " pizza. Every person will have " + slicesPerPerson + " slices and there will be " + leftOverSlices + " left over." );





    }
}
