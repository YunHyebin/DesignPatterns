package behavioralPattern.strategy;

public interface PaymentStrategy {
	//결제 처리 알고리즘 공통 인터페이스
	public void pay(int amount);

}
