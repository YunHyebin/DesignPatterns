package creationalPattern.builder;

//Director 역할
//Builder를 사용하여 제품 생성의 순서를 결정하고, 최종 객체를 생성한다.
public class PizzaDirector {
	private PizzaBuilder builder;
	
	public PizzaDirector(PizzaBuilder builder) {
		this.builder = builder;
	}
	
	public Pizza makePizza() {
	return builder.buildDough("Thin Crust")
					 .buildSauce("Tomato Sauce")
					 .buildTopping("Pineapple and Ham")
					 .getPizza();
	}

}