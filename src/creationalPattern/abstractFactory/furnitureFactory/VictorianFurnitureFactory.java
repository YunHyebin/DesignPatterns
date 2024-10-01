package creationalPattern.abstractFactory.furnitureFactory;

import creationalPattern.abstractFactory.furnitureProduct.Chair;
import creationalPattern.abstractFactory.furnitureProduct.Table;
import creationalPattern.abstractFactory.furnitureProduct.VictorianChair;
import creationalPattern.abstractFactory.furnitureProduct.VictorianTable;

//빅토리안 스타일 모든 가구를 생성하는 빅토리안가구 공장
public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Table createTable() {
		// TODO Auto-generated method stub
		return new VictorianTable();
	}

}
