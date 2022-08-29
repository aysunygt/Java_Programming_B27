package day6_operators;

public class RelationalTasks {
    /*
    declare a speed variable
    speed limit is 50
    find our if you are speeding
    true/false
     */
    public static void main(String[] args) {
        System.out.println("-------Speed------");

    int speedLimit = 50;
    int currentSpeed = 60;
    boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Is speeding = " + isSpeeding);
        System.out.println();

    /*
    declare a number variable
    find out if the number is positive , negative or zero
     */
        System.out.println("------Numbers------");
    int  number = -4;

    boolean isPositive = number > 0;
    boolean isNegative = number < 0;
    boolean isZero = number == 0;

        System.out.println("Is positive: " + isPositive);
        System.out.println("Is negative: " + isNegative);
        System.out.println("Is zero: " + isZero);











    }
}
