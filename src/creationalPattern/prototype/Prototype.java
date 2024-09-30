package creationalPattern.prototype;

//Prototype 인터페이스
//모든 복제 가능한 객체들은 이 인터페이스를 구현한다.
//clone 메소드를 통해 복제한다.
public interface Prototype {
	Prototype clone();
}
