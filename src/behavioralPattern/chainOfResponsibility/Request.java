package behavioralPattern.chainOfResponsibility;

//요청 객체. 요청의 인증, 권한, 유효셩 여부 나타냄
public class Request {
	private boolean authenticated;
	private boolean authorized;
	private boolean valid;
	
	public Request(boolean authenticated, boolean authorized, boolean valid) {
		this.authenticated = authenticated;
		this.authorized = authorized;
		this.valid = valid;
	}
	
	public boolean isAuthenticated() {
		return authenticated;
	}
	
	public boolean isAuthorized() {
		return authorized;
	}
	
	public boolean isValid() {
		return valid;
	}

}
