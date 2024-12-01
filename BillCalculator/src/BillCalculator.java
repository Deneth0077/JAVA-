import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============================================================================================================");
        System.out.println("___		               __    _ 				                      _	          _ ___  ___	             _        ");
        System.out.println("\\  \\	              / /   | |				                     | |            (_)   \\/   |	        | |	  ");
        System.out.println(" \\  \\	             / /    | |				                     | |              |  \\  /  |   	    | |       ");
        System.out.println("  \\  \\    /\\     / /____ | | _____ ______  _ __  ___   ___ _  | |_  ____      _|  |\\/|  | __ __ _ __| |_      ");
        System.out.println("   \\  \\  /  \\   / /     \\| |/  ___/  _  \\  |  _ `   \\ /     \\ |  __/  _  \\   | |  |  |  |/ _   |  __|  _|     ");
        System.out.println("    \\  \\/    \\ / /   _  \\  |  (___| (_)  | |  | | | |   _   / |  ||  (_)  |  | |  |  |  | (_|  | |  |  |      ");
        System.out.println("     \\   / \\  / /  ____ / |              | |  | | | |   __ /  |   \\      /   | |  |  |  |      | |  |  |      ");
        System.out.println("      \\ /   \\/_/ \\______|_|\\______\\ __ / |_|  |_| | |\\_____|  \\___ \\____/    |_|__|  |__|\\__,__|_|  \\__|      ");
        System.out.println("==============================================================================================================");
        //user input
        System.out.print("Enter Customer Phone Number - ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();


        System.out.println("===================================================================================================");

        double[] itemPrices = {250.00, 180.00, 150.00, 1200.00, 50.00, 120.00, 160.00};
        String[] itemNames = {"Basmathi", "Dhal", "Sugar", "Highland", "Yoghurt", "Flour", "Soap"};
        double[] itemQuantities = new double[itemPrices.length];
        double totalBill = 0.0;


        for (int i = 0; i < itemPrices.length; i++) {
            System.out.print( itemNames[i] +" " + "Quty(Kg) " + "-" + " " );
            itemQuantities[i] = scanner.nextDouble();
            totalBill += itemPrices[i] * itemQuantities[i];
        }

        String telHeader = String.format("%-73s", "                            #Tel   : " + phoneNumber);
        String nameHeader = String.format("%-73s", "                            #Name  : " + name);

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("|" + telHeader + "|");
        System.out.println("|" + nameHeader + "|");
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("| %-14s | %-17s| %-17s| %-17s|%n", "Item Name", "Qty", "Unit Price", "Price");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < itemPrices.length; i++) {
            System.out.printf("| %-15s|  %-16s|  %-16.2f|  %-16.2f|%n", itemNames[i], itemQuantities[i], itemPrices[i], itemPrices[i] * itemQuantities[i]);
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("| %-53s|  %-15s |%n", "                                  | Total ", "Rs. " + totalBill);
        System.out.println("|                                   |--------------------------------------");
        double discount = totalBill * 0.1; // 10% discount
        double finalBill = totalBill - discount;
        System.out.printf("| %-53s|  %-15s |%n", "                                  | Discount(10%)", "Rs. " + discount);
        System.out.println("|                                   |--------------------------------------");
        System.out.printf("| %-53s|  %-15s |%n", "                                  | Price  ", "Rs. " + finalBill);
        System.out.println("---------------------------------------------------------------------------");


        scanner.close();
    }
}
