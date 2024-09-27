package behavioralPattern.iterator;
import java.util.LinkedList;

public class LinkedListBookRepository implements Collection {
    private LinkedList<String> books;

    public LinkedListBookRepository(LinkedList<String> books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(books);
    }
}
