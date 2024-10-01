package structuralPattern.adapter.voltAdapter;

public class Client {

	public static void main(String[] args) {
		// 110V 전압 장치
		Voltage110V vol110V = new Voltage110V();

		// 어댑터로 220V전압으로 변환
		Voltage220V adapter = new VoltageAdapter(vol110V);

		System.out.println(adapter.output220V());
	}

}