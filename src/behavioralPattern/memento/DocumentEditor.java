package behavioralPattern.memento;

//Originator 클래스: 문서의 상태를 저장하고 복원하는 클래스
public class DocumentEditor {
 private String content;

 public void setContent(String content) {
     this.content = content;
     System.out.println("Current content: " + content);
 }

 public String getContent() {
     return content;
 }

 // 현재 상태를 Memento로 저장
 public Memento save() {
     return new Memento(content);
 }

 // Memento로부터 상태 복원
 public void restore(Memento memento) {
     content = memento.getState();
     System.out.println("Restored content: " + content);
 }
}
