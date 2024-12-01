package Collection_2023_V_E;

import java.util.HashMap;
import java.util.Map;


public class InventoryManager {
    private Map<String, Product> inventory;

    public  InventoryManager() {

        inventory = new HashMap<>();
    }
    public void addProduct(String code, String name, int quantity, double price) {
        Product product = inventory.get(code);
        if (product != null) {
            product.setName(name);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            inventory.put(code, new Product(name, quantity, price));
        }
    }

    public void removeProduct(String code) {
        inventory.remove(code);
    }

    public void displayInventory() {
        for (Map.Entry<String, Product> entry : inventory.entrySet()) {
            System.out.println("Code: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}