package behavioralPattern.templateMethod;

public class Client {

	public static void main(String[] args) {
		Beverage coffee = new Coffee();
		Beverage tea = new Tea();
		
		System.out.println("커피 준비 과정: ");
		coffee.prepareRecipe();
		
		System.out.println("\n차 준비 과정: ");
		tea.prepareRecipe();
	}
}
