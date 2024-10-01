package structuralPattern.decorator;

//ConcreteDecorator
//Decorator 추상클래스를 상속받아 설탕 추가 기능을 구현.
public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 설탕";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 200; // 설탕 추가 비용
    }
}