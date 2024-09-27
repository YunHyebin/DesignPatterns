package behavioralPattern.chainOfResponsibility;

//데이터 유효성 검사 처리자
public class ValidationHandler extends BaseHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.isValid()) {
            System.out.println("Request data is valid.");
            super.handleRequest(request); // 다음 핸들러로 전달
        } else {
            System.out.println("Request data is invalid.");
        }
    }
}
