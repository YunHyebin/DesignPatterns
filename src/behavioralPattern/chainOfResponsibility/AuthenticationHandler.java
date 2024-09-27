package behavioralPattern.chainOfResponsibility;

//요청 인증 핸들러
public class AuthenticationHandler extends BaseHandler{
	@Override
    public void handleRequest(Request request) {
        if (request.isAuthenticated()) {
            System.out.println("User is authenticated.");
            super.handleRequest(request); // 다음 핸들러로 전달
        } else {
            System.out.println("Authentication failed."); //요청 실패 시 체인 중단
        }
    }
}