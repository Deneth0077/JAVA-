package Nov_oop_2022_Q1;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<RegisteredCus> registeredCustomers = new ArrayList<>();

        RegisteredCus customer1 = new RegisteredCus(1, "John Doe");
        RegisteredCus customer2 = new RegisteredCus(2, "Jane Smith");

        registeredCustomers.add(customer1);
        registeredCustomers.add(customer2);

        for (RegisteredCus customer : registeredCustomers) {
            customer.display();
        }
    }
}
