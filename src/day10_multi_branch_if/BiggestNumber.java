package day10_multi_branch_if;

public class BiggestNumber {
    public static void main(String[] args) {

        int num = 483;
        int num1 = 42;
        int num2 = 32;
        int biggest = 0;

        // you don't need both options

        if(num > num1 && num > num2){
            biggest = num;
        } else if ( num1 > num && num1 > num2){
            biggest = num1;
        } else {
            biggest = num2;
        }
        System.out.println(biggest + " is the biggest");








    }
}
