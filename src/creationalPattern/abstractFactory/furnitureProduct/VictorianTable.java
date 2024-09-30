package creationalPattern.abstractFactory.furnitureProduct;

//빅토리안 스타일을 위한 테이블 제품 구현체
public class VictorianTable implements Table {
	public void placeOn() {
		System.out.println("Placing items on a victorian table");
	}
}