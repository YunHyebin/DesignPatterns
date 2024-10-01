package structuralPattern.composite;

//Component 인터페이스
//Leaf(개별객체)와 Composite(복합객체) 모두에 공통된 메소드를 정의한다.
public interface FileSystemComponent {
	public String getName();
	public void showDetails(); //재귀호출

}
