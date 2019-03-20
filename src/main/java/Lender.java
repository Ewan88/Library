import java.util.ArrayList;

public class Lender {

    private String name;
    private ArrayList<Literature> books;

    public Lender(String name){
        this.name = name;
        this.books = new ArrayList<Literature>();
    }


    public void addBook(Literature book) {
        this.books.add(book);
    }


    public int checkBooks() {
        return this.books.size();
    }
}
