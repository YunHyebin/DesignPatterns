package creationalPattern.builder;

//Builder
//Product(Pizza)생성에 필요한 여러 단계 메소드를 정의
public interface PizzaBuilder {
	PizzaBuilder buildDough(String dough);

	PizzaBuilder buildSauce(String sauce);

	PizzaBuilder buildTopping(String topping);

	Pizza getPizza();
}