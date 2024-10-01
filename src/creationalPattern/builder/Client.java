package creationalPattern.builder;

public class Client {
	public static void main(String[] args) {
		PizzaBuilder builder = new HawaiianPizzaBuilder();
		PizzaDirector director = new PizzaDirector(builder);
		Pizza pizza = director.makePizza();
		System.out.println(pizza.toString());
	}
}
