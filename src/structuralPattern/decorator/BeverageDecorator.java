package structuralPattern.decorator;

//BaseDecorator
//Beverage(Component)를 참조해서 기능을 동적으로 추가
public abstract class BeverageDecorator implements Beverage{
	protected Beverage beverage;
	
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

}
