package day6_operators;

public class SalaryCalculator {
    /*
    declare and assign these variables:

        salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax

    Sample data:
        100000 (salary)
        0.08 (state tax rate)
        0.21 (federal tax rate)

    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%

    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes..

     */
    public static void main(String[] args) {

        double salary  = 80_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax, federalTax, totalTax, salaryAfterTax;
        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "| Salary: " + salary + " | State Tax Rate: " + stateTaxRate + " | Federal Tax Rate: " + federalTaxRate + "\nState Tax: " + stateTax + " | Federal Tax: " + federalTax + " | Total Tax:$ " + totalTax + "\nTotal Salary After Taxes: " + salaryAfterTax;

        System.out.println(taxReport);






    }
}
