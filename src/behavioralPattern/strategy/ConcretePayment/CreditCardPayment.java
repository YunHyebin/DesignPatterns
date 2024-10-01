package behavioralPattern.strategy.ConcretePayment;
import behavioralPattern.strategy.PaymentStrategy;


public class CreditCardPayment implements PaymentStrategy {
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardPayment(String nm, String cNum, String ccv, String expiryDate) {
		this.name = nm;
		this.cardNumber = cNum;
		this.cvv = ccv;
		this.dateOfExpiry = expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Credit card");
	}

}
