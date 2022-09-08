package day10_multi_branch_if;

public class LetterType {
    /*
    create a char variable letter. Find and print if the character is a letter, number, or a special character

    ex: p
        letter

    Ex:6
        number

    Ex: $
        special character
     */
    public static void main(String[] args) {

        char character = 'p';

        boolean isLetter = (character >= 'A' && character <= 'Z' ) || (character >= 'a' && character <= 'z');
        boolean isNUmber =  character >= ')' && character <= '9';

        if(isLetter){
            System.out.println(character + " is a letter");
        }
        if(isNUmber){
            System.out.println(character + " is a number");
        }
         if(!isLetter && !isNUmber){
             System.out.println(character + " is a special character");
         }









    }
}
