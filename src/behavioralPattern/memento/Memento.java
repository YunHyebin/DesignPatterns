package behavioralPattern.memento;

//Memento 클래스: 문서의 상태를 저장
public class Memento {
 private final String state;

 public Memento(String state) {
     this.state = state;
 }

 public String getState() {
     return state;
 }
}

