package behavioralPattern.chainOfResponsibility;

public abstract class BaseHandler implements Handler {
	private Handler nextHandler;

	@Override
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	@Override
	public void handleRequest(Request request) {
		if (nextHandler != null) {
			nextHandler.handleRequest(request);
		}
	}

}