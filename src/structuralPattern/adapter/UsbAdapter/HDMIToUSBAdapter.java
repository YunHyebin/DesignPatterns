package structuralPattern.adapter.UsbAdapter;

//Adapter역할
//Client Interface(USBPort)와 Adaptee(HDMI)를 연결하는 클래스
public class HDMIToUSBAdapter implements USBPort {
private HDMI hdmi;
	
	public HDMIToUSBAdapter(HDMI hdmi) {
		this.hdmi = hdmi;
	}
	
	@Override 
	public void connectWithUSB() {
		//Adapter는 USB인터페이스를 구현하여 HDMI연결을 수행
		hdmi.connectWithHDMI();
	}
}