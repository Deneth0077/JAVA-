package Collection_2022_V_A;

import java.util.HashMap;

public class Library {
    public static void main(String[] args) {
            // Creating the HashMap
            HashMap<Integer, Book<?, ?>> bookList = new HashMap<>();

            // Creating Book objects
            Book<String, String> book1 = new Book<>("Harry Potter", "ISBN12345");
            Book<String, Integer> book2 = new Book<>("Rings of Power", 123456);

            // Adding Book objects to the HashMap
            bookList.put(1, book1);
            bookList.put(2, book2);

            // Iterating through the bookList and printing details
            for (int id : bookList.keySet()) {
                Book<?, ?> value = bookList.get(id);
                System.out.println("Book ID is: " + id + " and the ISBN is: " + value.getISBN());
            }
        }
    }
