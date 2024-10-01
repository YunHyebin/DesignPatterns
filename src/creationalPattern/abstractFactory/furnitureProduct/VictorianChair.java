package creationalPattern.abstractFactory.furnitureProduct;

//빅토리안 스타일을 위한 의자 제품 구현체
public class VictorianChair implements Chair {
	public void sitOn() {
		System.out.println("Sitting on a victorian chair");
	}
}