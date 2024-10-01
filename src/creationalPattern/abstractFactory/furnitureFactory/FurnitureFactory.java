package creationalPattern.abstractFactory.furnitureFactory;

import creationalPattern.abstractFactory.furnitureProduct.Chair;
import creationalPattern.abstractFactory.furnitureProduct.Table;

//가구 제품을 생성할 가구 공장 인터페이스
public interface FurnitureFactory {
	Chair createChair();
	Table createTable();

}
