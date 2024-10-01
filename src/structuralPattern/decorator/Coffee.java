package structuralPattern.decorator;

//Concrete Component
// 기본 음료인 커피
public class Coffee implements Beverage {

	@Override
	public String getDescription() {
		return "커피";
	}

	@Override
	public double getCost() {
		return 3000; // 기본가격
	}

}
