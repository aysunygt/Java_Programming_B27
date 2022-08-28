package day5_arithmetic_operators;

public class TypeCasting {
    public static void main(String[] args) {

        System.out.println("Smaller to bigger;");
        System.out.println();
        byte b = 14;
        int i = b; // int is bigger , so this is automatic because we are going smaller to bigger

        long l = 40; // by default 40 is int type, so int can automatically be store into a long because in is smaller than long
        // simdi 40 default'ta int olarak geciyor zaten ve int i zaten long'dan kucuk so burda manually birsey yok automatically done
        long l2 = 30000000000L; // 300000000000 is int by default, but it is too big for int typee, we we need to tell the compiler it is a long type with the L .. and still it is done automatically because int i is still smaller than long.

        float f = 10; // 10 is int by default, int i is smaller than float, so it will automatically be casted and the answer will be 10.0 because it is pointed numbers
        System.out.println(f);

        System.out.println();
        System.out.println("Bigger to smaller;");
        System.out.println();

        double d = 19.99;
        int i2 = (int) d; // double is bigger than int, so we will cast it manually
        System.out.println(i2); // the result will be integer type because we converted double points to int which is integer.

        int i3 = 500;
        byte b2 = (byte) i3; // int is bigger than byte, so we need to cast manually
        System.out.println(b2); // the result will be -12 because int is way bigger for byte.. Byte type only goes from -127 to 127..

        short s = 60;
        double d3 = s; // automatically
        System.out.println(d3);

        float f2 = (float) 100.50; // or you can do 100.50F
        long l3 = (long) f2; //manually because float is bigger than long
        System.out.println(l3); // it will lose .50 because we are converting pointed number to integer

        double d4 = l3; // l3 is converted to 100 so the result will be 100.0 because integer to pointed number
        // but if we write double d4 = f2 then result will be 100.5 because is it before conversion
        System.out.println(d4); //








    }
}
