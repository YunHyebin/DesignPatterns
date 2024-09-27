package behavioralPattern.iterator;
import java.util.LinkedList;

public class LinkedListIterator implements Iterator {
	//LinkedList 컬렉션을 순회하기 위한 구체적인 알고리즘 구현
	
    private LinkedList<String> items;
    private int position = 0;

    public LinkedListIterator(LinkedList<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public Object getNext() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
