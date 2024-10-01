package creationalPattern.prototype;

//복제가 가능한 실제 객체
public class Person implements Prototype {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//복제 메소드(얕은 복사: 주소값 복사)
	@Override
	public Prototype clone() {
		return new Person(this.name, this.age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
