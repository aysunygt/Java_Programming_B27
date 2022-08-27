package day3_variables_cont;

public class School {
    public static void main(String[] args) {
        /*
        Add a new class School
        add main method

        declare and assign all there variables:
        (all int) grade1, grade2, grade3, grade4, grade5

        assign the number of students in each grade

        extra: try to create another variable to find the total number of students in the whole school

        (all double) average GPA, number of school days, number of snow days

         */

        int grade1 = 14;
        int grade2 = 12;
        int grade3 = 14;
        int grade4 = 16;
        int grade5 = 19;

        int total = grade1 + grade2 + grade3 + grade4 + grade5;

        double averageGPA = 3.8;
        double numberOfSchoolDays = 110.5;
        double numberOfSnowDays = 3.5;

        System.out.println("Average students in this school: " + total + "\nAverage GPA to get into this school: " + averageGPA + "\nTotal number of school days: " + numberOfSchoolDays + "\nNumber of snow days: " + numberOfSnowDays);









    }
}
