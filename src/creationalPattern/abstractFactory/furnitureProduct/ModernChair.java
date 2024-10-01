package creationalPattern.abstractFactory.furnitureProduct;

//모던 스타일을 위한 의자 제품 구현체
public class ModernChair implements Chair {

	@Override
	public void sitOn() {
		System.out.println("Sitting on a modern chair.");
	}

}
