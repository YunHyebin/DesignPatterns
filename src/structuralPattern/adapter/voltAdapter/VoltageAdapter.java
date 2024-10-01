package structuralPattern.adapter.voltAdapter;

//Adapter
public class VoltageAdapter implements Voltage220V {
	private Voltage110V voltage110V;

	public VoltageAdapter(Voltage110V voltage110V) {
		this.voltage110V = voltage110V;
	}

	@Override
	public String output220V() {
		return voltage110V.output110V() + "를 변환하여 220V 전압 출력합니다";
	}
}