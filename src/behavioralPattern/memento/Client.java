package behavioralPattern.memento;

//Client 클래스 : DocumentEditor를 통해 문서를 편집하고 Caretaker를 사용하여 undo 기능 사용
public class Client {
    public static void main(String[] args) {
        // 문서 편집기(Originator)
        DocumentEditor editor = new DocumentEditor();
        // Caretaker 생성
        CareTaker caretaker = new CareTaker();

        // 문서 상태 편집 및 저장
        editor.setContent("First version of the document.");
        caretaker.saveState(editor.save()); // 상태 저장

        editor.setContent("Second version of the document.");
        caretaker.saveState(editor.save()); // 상태 저장

        editor.setContent("Third version of the document.");
        caretaker.saveState(editor.save()); // 상태 저장

        // 현재 상태 출력
        System.out.println("Current document: " + editor.getContent());

        // 두 번 실행 취소 (상태 복원)
        editor.restore(caretaker.undo()); // 실행 취소하여 "Second version" 복원
        editor.restore(caretaker.undo()); // 실행 취소하여 "First version" 복원
    }
}