package structuralPattern.bridge.color;

//Concrete Implementation 빨간색 색상 구현
public class Red implements Color {

	@Override
	public String fill() {
		return "빨간색으로 채움";
	}

}
