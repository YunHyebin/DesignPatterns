package behavioralPattern.strategy;

import java.util.Scanner;

import behavioralPattern.strategy.ConcretePayment.CreditCardPayment;
import behavioralPattern.strategy.ConcretePayment.KAKAOPayment;
import behavioralPattern.strategy.ConcretePayment.PaypalPayment;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PaymentProcessor processor = new PaymentProcessor();
		ShoppingCart cart = new ShoppingCart();
		
		Item a = new Item("치킨", 10000);
		Item b = new Item("콜라", 2000);
		
		cart.addItem(a);
		cart.addItem(b);
		int totalAmount = cart.calculateTotal();
		
		System.out.print("결제 방법 선택: 1.카카오 2. 신용카드 3. paypal : ");
		int stg = sc.nextInt();
		System.out.print("카드 명: ");
		String name = sc.next();
		System.out.print("카드 번호: ");
		String cardNum = sc.next();
		System.out.print("cvv 번호 : ");
		String cvv = sc.next();
		System.out.print("만료기간: ");
		String date = sc.next();
		
		switch(stg) {
		case 1 : 
			processor.setPaymentStrategy(new KAKAOPayment(name, cardNum, cvv, date));
			break;
		case 2 : 
			processor.setPaymentStrategy(new CreditCardPayment(name, cardNum, cvv, date));
			break;
		case 3 : 
			processor.setPaymentStrategy(new PaypalPayment(name, cardNum, cvv, date));
			break;
		default : 
			System.out.println("잘못된 결제 방법 선택입니다");
			return;
		}
		
		processor.processPayment(totalAmount);
		
	}

}
