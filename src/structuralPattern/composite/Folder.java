package structuralPattern.composite;

import java.util.ArrayList;
import java.util.List;

//Composite 클래스
//복합객체(디렉토리)로, 여러 File(Leaf)나, 다른 Folder(Composite)를 가질 수 있다.
//showDetails 메소드로 재귀적으로 ㅗ출하여, File객체를 저장한 하위 Folder 객체를 순회힌다.
//재귀호출을 받은 하위 Composite는 또, 하위 요소에게 작업을 위임한다.
public class Folder implements FileSystemComponent {
	private String name;
	private List<FileSystemComponent> components = new ArrayList<>();

	public Folder(String name) {
		this.name = name;
	}

	public void addComponent(FileSystemComponent component) {
		components.add(component);
	}

	public void removeComponent(FileSystemComponent component) {
		components.remove(component);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void showDetails() {
		System.out.println("폴더: " + getName());
		for (FileSystemComponent component : components) {
			component.showDetails();
		}
	}
}
