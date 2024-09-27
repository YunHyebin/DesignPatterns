package behavioralPattern.iterator;

public interface Iterator {
	//컬렉션의 요소들을 순차적으로 접근할 수 있는 메소드를 정의해야 한다.
	boolean hasNext(); //다음 요소 여부 확인
	Object getNext(); //다음 요소 가져오기

}
