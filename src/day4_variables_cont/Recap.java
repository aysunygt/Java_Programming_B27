package day4_variables_cont;

public class Recap {
    public static void main(String[] args) {

        //declare variable
        double temperature = 74.2;
        byte numberOfJavaDays = 4;
        short numberOfSoftSkillsDays = 2;

        System.out.println("temperature = " + temperature + " F");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays);

        System.out.println();

        int numberOfCoffeesIHadToday= 3;
        float ratingOfMovie = 8.9F; //compiler takes 8.9 as double if we don't put F to the end
        long waterInOcean = 200_000_000_000_000L; // compiler takes this number as a int by default so we need to put L at the end to make it Long type

        System.out.println("numberOfCoffeesIHadToday = " + numberOfCoffeesIHadToday);
        System.out.println("ratingOfMovie = " + ratingOfMovie);
        System.out.println("waterInOcean = " + waterInOcean + " Liters");












    }
}
