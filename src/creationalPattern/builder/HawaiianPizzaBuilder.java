package creationalPattern.builder;

//ConcreteBuilder
//Builder 인터페이스를 구현하고, 실제 Product(Pizza)를 생성
public class HawaiianPizzaBuilder implements PizzaBuilder {
	private Pizza pizza;

	public HawaiianPizzaBuilder() {
		this.pizza = new Pizza();
	}

	// 메소드 체이닝을 위해 this를 반환한다.
	public PizzaBuilder buildDough(String dough) {
		pizza.setDough(dough);
		return this;
	}

	public PizzaBuilder buildSauce(String sauce) {
		pizza.setSauce(sauce);
		return this;
	}

	public PizzaBuilder buildTopping(String topping) {
		pizza.setTopping(topping);
		return this;
	}

	public Pizza getPizza() {
		return pizza;
	}
}
