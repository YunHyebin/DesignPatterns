package creationalPattern.abstractFactory.furnitureFactory;

import creationalPattern.abstractFactory.furnitureProduct.Chair;
import creationalPattern.abstractFactory.furnitureProduct.ModernChair;
import creationalPattern.abstractFactory.furnitureProduct.ModernTable;
import creationalPattern.abstractFactory.furnitureProduct.Table;

//모던스타일 모든 제품을 생성하는 모던가구 공장
public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Table createTable() {
		return new ModernTable();
	}

}
