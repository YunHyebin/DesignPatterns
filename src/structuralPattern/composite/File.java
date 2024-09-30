package structuralPattern.composite;

//Leaf 클래스
//개별 객체(파일로 작업을 위임할 하위 객체가 없어서 자신의 고유 작업을 수행한다.
public class File implements FileSystemComponent {
	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void showDetails() {
		System.out.println("파일: " + getName());

	}

}
