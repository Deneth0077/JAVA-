package Collection_2023_V_E;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        // Create an empty PriorityQueue to store book titles
        PriorityQueue<String> Books = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        //Accept book titles from the user
        System.out.println("enter the book title (can you exit type-'done') :");
        while(true){
            String bookTitle = sc.nextLine();
            if(bookTitle.equalsIgnoreCase("done")){
                break;
            }
            Books.add(bookTitle);
        }

        //remove book title in queue
        System.out.println("Enter the title the book do you want remove :");
        String titleRemove = sc.nextLine();
        boolean remove = Books.remove(titleRemove);
        if(remove){
            System.out.println("Book title" + titleRemove + "Success full removed");
        }else{
            System.out.println("Book title" +titleRemove+ "Failed remove ");
        }

        //find the total no of books
        int totalBooks = Books.size();
        System.out.println("Total no of books :" + totalBooks);

        System.out.println("Print the all Books list :");
        for(String book : Books){
            System.out.println(book);
        }

    }
}
