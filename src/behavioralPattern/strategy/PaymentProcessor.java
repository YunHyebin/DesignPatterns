package behavioralPattern.strategy;

public class PaymentProcessor {
	//Context : 결제 방식에 따른 전략을 사용하는 클래스
	private PaymentStrategy strategy;
	
	public void setPaymentStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void processPayment(int amount) {
		strategy.pay(amount);
	}

}
