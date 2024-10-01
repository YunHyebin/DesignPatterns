package creationalPattern.prototype;

public class Client {
	private Prototype prototype;
	
	//prototype 객체를 주입받는 생성자
	public Client(Prototype prototype) {
		this.prototype = prototype;
	}
	
	//prototype 객체 복사 메소드
	public Prototype createClone() {
		return prototype.clone(); //복제된 객체 반환
	}

	public static void main(String[] args) {
		// 원본 객체 생성
        Person original = new Person("John Doe", 30);
        System.out.println("Original: " + original);

        // 클라이언트가 원본 객체를 사용하여 복제 수행
        Client client = new Client(original);
        Person cloned = (Person) client.createClone();

        // 복제된 객체 정보 출력
        System.out.println("Cloned: " + cloned);

        // 복제된 객체의 속성 변경
        cloned.setName("Jane Doe");
        cloned.setAge(25);
        
        // 원본 객체의 속성 변경
        original.setName("John Park");
        original.setAge(31);

        // 원본 객체와 복제된 객체 비교
        System.out.println("After modification - Original: " + original);
        System.out.println("After modification - Cloned: " + cloned);
    }
}