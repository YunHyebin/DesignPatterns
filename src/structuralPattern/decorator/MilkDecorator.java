package structuralPattern.decorator;

//ConcreteDecorator
//Decorator 추상클래스를 상속받아 우유 추가 기능을 구현.
public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 500; // 우유 추가 비용
    }
}