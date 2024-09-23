package behavioralPattern.templateMethod;

public class Coffee extends Beverage{
	//ConcreteClass1: 커피 준비 과정을 구현한 클래스
	@Override
	protected void brew() {
		System.out.println("커피를 필터에 넣고 우려냅니다.");	
	}

	@Override
	protected void addCondiments() {
		System.out.println("설탕과 우유를 추가합니다.");
	}

}
