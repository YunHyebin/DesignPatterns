package structuralPattern.composite;

public class Client {
	public static void main(String[] args) {
		FileSystemComponent file1 = new File("국어.txt");
		FileSystemComponent file2 = new File("수학.txt");
		
		Folder folder1 = new Folder("공부");
		folder1.addComponent(file1);
		folder1.addComponent(file2);
		
		FileSystemComponent file3 = new File("미술.png");
		Folder folder2 = new Folder("예체능");
		folder1.addComponent(folder2); //복합객체 안 복합객체
		folder2.addComponent(file3);
		
		folder1.showDetails(); //디렉토리와 파일을 동일하게 다룸
	}
}
