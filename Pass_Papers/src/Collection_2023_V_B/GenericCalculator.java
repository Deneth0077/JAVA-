package Collection_2023_V_B;

import java.util.Arrays;

public class GenericCalculator {

    // Method to calculate the maximum value in an array
    public <T extends Number & Comparable<T>> T calculateMaximum(T[] array) {
        return Arrays.stream(array).max(T::compareTo).orElse(null);
    }

    // Method to calculate the product of elements in an array
    public <T extends Number> T calculateProduct(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        // We need to handle the product in a way that maintains precision
        Double product = 1.0;
        for (T element : array) {
            product *= element.doubleValue();
        }

        // Returning the result as the same type as the input array
        if (array[0] instanceof Integer) {
            return (T) Integer.valueOf(product.intValue());
        } else if (array[0] instanceof Double) {
            return (T) Double.valueOf(product);
        } else if (array[0] instanceof Float) {
            return (T) Float.valueOf(product.floatValue());
        }

        return null;
    }
}



