package behavioralPattern.strategy.ConcretePayment;
import behavioralPattern.strategy.PaymentStrategy;

public class PaypalPayment implements PaymentStrategy{
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public PaypalPayment(String nm, String cNum, String ccv, String expiryDate) {
		this.name = nm;
		this.cardNumber = cNum;
		this.cvv = ccv;
		this.dateOfExpiry = expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal");
	}


}
