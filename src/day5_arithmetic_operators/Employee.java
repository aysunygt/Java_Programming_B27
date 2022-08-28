package day5_arithmetic_operators;

public class Employee {
    /*
    create a class employee
    create a main method

    eclare and assign these variables with the most appropriate datatypes;

        - first name, last name, company name, job title, suite(char), employee id, number of PTO, salary, is full time

   declare new variables and use concatenation from previous variables to set their values

            - full name ( first and last name)
            - email (first name + employee id @ company name.com)
            - benefits (salary, number of PTO and add "work from home")

     create a summary of the information and print it. Be creative
        example: Employee information for James Bond. Secret agent for MI6, based in suite C. Mr. Bond is full time: true. Contact Mr bond at james7@MI6.com. current benefits include $ 10000000 salary a year, 20 PTO days and work from home.
     */
    public static void main(String[] args) {

        String firstName = "Aysun";
        String lastName = "Yigit";
        String company = "Yigitler Clinic";
        String jobTitle = "Doctor";
        char suite = 'E';
        int employeeId = 1;
        int numberOfPTO = 17;
        double salary = 1_000_000.0;
        boolean isFullTime = true;

        String fullName = firstName + " " + lastName;
        String email = firstName + employeeId + '@' + company +".com";
        String benefits = "$" + salary + " salary a year" + "\n" +numberOfPTO + " PTO days and WFH";

        String summary= "Employee Information for" + fullName + ". \n" + jobTitle + " for " + company + ", based in suite " + suite + "Mr/Mrs" + lastName + " is full time" + ". Contact Mr/Mrs " + lastName + " at " + email + ". Current benefits include " + benefits;

        System.out.println(summary);










    }
}
