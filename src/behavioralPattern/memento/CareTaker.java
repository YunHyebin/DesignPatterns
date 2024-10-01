package behavioralPattern.memento;
import java.util.Stack;

//Caretaker 클래스: Memento(문서) 객체를 저장하고, 여러 생타를 관리
public class CareTaker {
 private Stack<Memento> history = new Stack<>();

 // 문서 상태를 저장
 public void saveState(Memento memento) {
     history.push(memento);
 }

 // 마지막 상태를 꺼내어 복원
 public Memento undo() {
     if (!history.isEmpty()) {
         return history.pop();
     }
     return null;
 }
}

