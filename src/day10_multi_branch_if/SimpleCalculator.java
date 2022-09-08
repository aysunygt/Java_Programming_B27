package day10_multi_branch_if;

public class SimpleCalculator {
    public static void main(String[] args) {

        double numOne = 23;
        double numTwo = 34;
        char operator = '*';
        double result = 0; // starting point

        if(operator == '+'){

        } else if( operator == '-'){
            result = numOne + numTwo;
        } else if (operator == '*' || operator == 'x'){
            result = numOne * numTwo;
        } else if (operator == '/'){
            result = numOne / numTwo;
        } else if (operator == '%'){
            result = numOne % numTwo;
        } else {
            System.out.println("Invalid Operator!");
        }

        System.out.println("" + numOne + " " + operator + " " + numTwo + " = "+ result ); // we put "" this sign at the beginning because coding starts from left to right and we want this to be concatenation not like addition so we put "" this.
        System.out.println(numOne + " " + operator + " " + numTwo + " = "+ result ); // this is the other way to make it concatenation just put a string sign..



    }
}
