package behavioralPattern.templateMethod;

public abstract class Beverage {
	//음료 준비 과정의 템플릿을 정의하는 상위 클래스
	
	//template method: 음료를 준비하는 전체적인 과정을 정의
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	
	//상위 클래스에서 공통으로 사용하는 메소드
	protected void boilWater() {
		System.out.println("물을 끓입니다.");
	}
	protected void pourInCup() {
		System.out.println("컵에 따릅니다.");
	}
	
	//하위 클래스에서 구체적으로 구현해야 하는 추상 메소드
	protected abstract void brew();
	protected abstract void addCondiments();
}
