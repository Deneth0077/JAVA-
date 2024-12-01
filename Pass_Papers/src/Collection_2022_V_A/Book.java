package Collection_2022_V_A;
//Generic Book class
// Generic Book class
public class Book<T1, T2> {
    private T1 bookTitle;
    private T2 bookISBN;

    // Overloaded constructor
    public Book(T1 bookTitle, T2 bookISBN) {
        this.bookTitle = bookTitle;
        this.bookISBN = bookISBN;
    }

    // Getter for bookISBN
    public T2 getISBN() {
        return bookISBN;
    }
}
