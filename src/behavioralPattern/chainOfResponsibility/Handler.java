package behavioralPattern.chainOfResponsibility;

public interface Handler {
	void setNext(Handler nextHandler); //다음 핸들러 설정
	void handleRequest(Request request); //요청 처리 메소드

}
