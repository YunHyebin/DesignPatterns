package behavioralPattern.iterator;

public class ArrayBookRepository implements Collection {
    private String[] books;

    public ArrayBookRepository(String[] books) {
        this.books = books;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(books);
    }
}