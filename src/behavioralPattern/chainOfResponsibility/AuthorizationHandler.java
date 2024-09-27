package behavioralPattern.chainOfResponsibility;

//권한 인증 핸들러
public class AuthorizationHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.isAuthorized()) {
            System.out.println("User is authorized.");
            super.handleRequest(request); // 다음 핸들러로 전달
        } else {
            System.out.println("Authorization failed.");
        }
    }
}
