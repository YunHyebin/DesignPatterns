package behavioralPattern.iterator;

public class ArrayIterator implements Iterator {
	//ArrayList 컬렉션을 순회하기 위한 구체적인 알고리즘 구현
	
	private String[] items;
    private int position = 0;

    public ArrayIterator(String[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public Object getNext() {
        if (this.hasNext()) {
            return items[position++];
        }
        return null;
    }
}
