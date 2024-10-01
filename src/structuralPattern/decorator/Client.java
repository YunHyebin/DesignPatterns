package structuralPattern.decorator;

public class Client {
	public static void main(String[] args) {
		Beverage beverage = new Coffee();
		System.out.println(beverage.getDescription() + " : " + beverage.getCost() + "원");

		// 우유 추가
		beverage = new MilkDecorator(beverage);
		System.out.println(beverage.getDescription() + " : " + beverage.getCost() + "원");

		// 설탕 추가
		beverage = new SugarDecorator(beverage);
		System.out.println(beverage.getDescription() + " : " + beverage.getCost() + "원");
	}
}