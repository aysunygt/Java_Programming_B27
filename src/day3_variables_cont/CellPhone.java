package day3_variables_cont;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "iPhone 12 Pro";
        String color = "Navy Blue";
        double price = 999.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';

        System.out.println("\t\t Phone Information: \nBrand: " + brand);
        System.out.println(model + " in " + color);
        System.out.println("With " + size + "gb\nPrice $: " + price);
        System.out.println("Sim type: " + sim + "\nHas Camera: " + hasCamera);
        System.out.println();

        //Another alternative solution:

        String report = "\t\tPhone Information: \nBrand: " + brand + "\nModel: " + model + " in " + color + "\nSize: " + size + "gb" + "\nPrice: $" + price + "\nSim type: " + sim + "\nHas camera: " + hasCamera;

        System.out.println(report);





    }
}
