package structuralPattern.bridge.color;

//Concrete Implementation 파란색 색상 구현
public class Blue implements Color {

	@Override
	public String fill() {
		return "파란색으로 채움";
	}

}
