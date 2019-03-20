import java.util.ArrayList;

public class Library {

    private ArrayList<Literature> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Literature>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Literature book) {
        if (this.capacity != books.size()){
            this.books.add(book);
        }
    }

    public void lendBook(Literature book, Lender lender) {
        this.books.remove(book);
        lender.addBook(book);
    }
}
