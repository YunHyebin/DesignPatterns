package behavioralPattern.command;

//	Chef(Receiver): Command의 실제 비즈니스 로직(작업)을 수행하는 클래스.
public class Chef {
	public void cook(String dishName) {
        System.out.println("Chef is cooking " + dishName);
    }
}
