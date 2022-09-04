package day9_if_statements;

public class PayDay {
    public static void main(String[] args) {

        double hourlyRate = 70;
        int hoursPerWeek = 45;
        double netPay;

        if(hoursPerWeek > 40){
            //overtime calculation
            int overTimeHours = hoursPerWeek - 40;
            netPay = hourlyRate * 40; // calculate the normal pay for a 40 hour week
           netPay += hourlyRate * hoursPerWeek * 1.5; // total earned from overtime

        } else {
            // worked under 40 hours, so no overtime
            netPay = hourlyRate * hoursPerWeek;
        }

        System.out.println("Net pay: " + netPay);






    }
}
