package behavioralPattern.command;

//OrderCommand(Command): 실행할 작업(명령)을 캡슐화하는 인터페이스
//특정 작업(명령)을 실행하기 위한 단일 메소드 execute만 선언한다.
public interface OrderCommand {
	void execute();
}
