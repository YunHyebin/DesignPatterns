package behavioralPattern.chainOfResponsibility;

public class Client {
	public static void main(String[] args) {
        // 체인 설정
        Handler authenticationHandler = new AuthenticationHandler();
        Handler authorizationHandler = new AuthorizationHandler();
        Handler validationHandler = new ValidationHandler();

        authenticationHandler.setNext(authorizationHandler);
        authorizationHandler.setNext(validationHandler);

        // 클라이언트가 요청을 생성하고 체인의 첫 번째 핸들러에게 전달
        Request request = new Request(true, true, true); // 모든 조건이 통과되는 요청
        authenticationHandler.handleRequest(request);

        System.out.println();

        Request invalidRequest = new Request(true, false, true); // 권한 실패 요청
        authenticationHandler.handleRequest(invalidRequest);
    }
}