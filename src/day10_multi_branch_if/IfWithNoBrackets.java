package day10_multi_branch_if;

public class IfWithNoBrackets {
    public static void main(String[] args) {

        if (3 < 9) {
            System.out.println("First");
            System.out.println("Second");
        }

        if (3 > 9)
            System.out.println("Third"); // we can do it without the brackets


        System.out.println("fourth"); // but the second sout option does not count as a if statement

        System.out.println("----------------------");
        System.out.println();

        if( 5 % 2 == 0)
            System.out.println("even");
         // System.out.println("Something");     -> we can't put another sout statement between if else statements if there is no brackets
        else
            System.out.println("odd");

        System.out.println("-----------------------");
        System.out.println();

        char a = 'a';

        if( a == 'a')
            System.out.println("Letter a");
        else if(a == 'b')
            System.out.println("Letter b");
        else if (a == 'c')
            System.out.println("Letter c");
        else
            System.out.println("other");

    }
}
