package day7_operators_andScanners;

public class GiftCardHw {
    /*

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using gift card and subtract 150 from the amount
    reduce the times used by one
    print using gift card and subtract 99 from the amount
    reduce the time used by one
    print information at the end
     */
    public static void main(String[] args) {

    double giftCard = 500;
    int uses= 3;
        System.out.println("Gift card is used. 150 is removed");
        giftCard -= 150; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Gift card is used. $99 is removed.");
        giftCard -= 99; // giftCard = giftCard - 99;
        uses--;
        System.out.println("Gift card balance left $" + giftCard);
        System.out.println("Number of times card can be used: " + uses);








    }
}
