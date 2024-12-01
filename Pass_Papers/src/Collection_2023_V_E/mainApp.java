package Collection_2023_V_E;

public class mainApp {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding 5 products to the inventory
        manager.addProduct("P001", "Laptop", 10, 999.99);
        manager.addProduct("P002", "Smartphone", 15, 499.99);
        manager.addProduct("P003", "Tablet", 8, 299.99);
        manager.addProduct("P004", "Headphones", 20, 79.99);
        manager.addProduct("P005", "Keyboard", 25, 49.99);

        System.out.println("Initial Inventory:");
        manager.displayInventory();

        // Removing 2 products from the inventory
        manager.removeProduct("P003");
        manager.removeProduct("P005");

        System.out.println("\nInventory after removal:");
        manager.displayInventory();
    }
}

