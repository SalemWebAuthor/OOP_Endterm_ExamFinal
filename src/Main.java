import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Price for the different jewelry materials
        final double GOLD_PRICE_PER_GRAM = 1900;
        final double SILVER_PRICE_PER_GRAM = 1300;
        final double DIAMOND_PRICE_PER_CARAT = 45000;

        // wholesale and retail markup percentages
        final double WHOLESALE_MARKUP = 0.5;
        final double RETAIL_MARKUP = 0.55;

        // Prompt the user to enter the jewelry type
        System.out.print("Enter the type of jewelry (bracelet, earring, necklace, ring): ");
        String type = input.nextLine();

        // Prompt the user to enter the material
        System.out.print("Enter the material (gold, silver, diamond): ");
        String material = input.nextLine();

        // Prompt the user to enter the weight of the jewelry in grams
        System.out.print("Enter the weight of the jewelry in grams: ");
        double weight = input.nextDouble();

        // Calculate the base price based on the material and weight
        double basePrice = 0.0;
        if (material.equalsIgnoreCase("gold")) {
            basePrice = weight * GOLD_PRICE_PER_GRAM;
        } else if (material.equalsIgnoreCase("silver")) {
            basePrice = weight * SILVER_PRICE_PER_GRAM;
        } else if (material.equalsIgnoreCase("diamond")) {
            // Prompt the user to enter the number of carats
            System.out.print("Enter the number of carats: ");
            double carats = input.nextDouble();
            basePrice = carats * DIAMOND_PRICE_PER_CARAT;
        }

        // to calculate the wholesale price
        double wholesale = basePrice + (basePrice * WHOLESALE_MARKUP);

        // to calculate the retail price
        double retail = basePrice + (basePrice * RETAIL_MARKUP);





        // to show the GUI
        GUI gui = new GUI(type,material,weight,basePrice,wholesale,retail);
        gui.createAndShowGUI();
    }
}