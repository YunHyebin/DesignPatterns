package behavioralPattern.strategy;

import java.util.List;
import java.util.ArrayList;

public class ShoppingCart {
	List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removItem(Item item) {
		this.items.remove(item);
	}
	
	public int calculateTotal() {
		int sum = 0;
		for(Item item: items) {
			sum += item.getPrice();
		}
		return sum;
	}

}
