package Collection_2023_V_B;

import java.util.Arrays;

// MainApp.java
public class MainApp {
    public static void main(String[] args) {
        // Create GenericCalculator instance for Integer type
        GenericCalculator intCalculator = new GenericCalculator();
        Integer[] intArray = {1, 2, 3, 4, 5};
        Integer intMax = intCalculator.calculateMaximum(intArray);
        Integer intProduct = intCalculator.calculateProduct(intArray);

        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Maximum Value: " + intMax);
        System.out.println("Product: " + intProduct);

        // Create GenericCalculator instance for Double type
        GenericCalculator doubleCalculator = new GenericCalculator();
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Double doubleMax = doubleCalculator.calculateMaximum(doubleArray);
        Double doubleProduct = doubleCalculator.calculateProduct(doubleArray);

        System.out.println("\nDouble Array: " + Arrays.toString(doubleArray));
        System.out.println("Maximum Value: " + doubleMax);
        System.out.println("Product: " + doubleProduct);
    }
}
