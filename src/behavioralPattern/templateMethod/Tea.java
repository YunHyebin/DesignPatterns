package behavioralPattern.templateMethod;

public class Tea extends Beverage{
	//ConcreteClass2: 차 준비과정을 구현한 클래스

	@Override
	protected void brew() {
		System.out.println("차 티백을 우려냅니다.");
	}

	@Override
	protected void addCondiments() {
		System.out.println("레몬을 추가합니다.");
	}

}
