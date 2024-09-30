package structuralPattern.adapter.usbAdapter;

public class Client {

	public static void main(String[] args) {
		HDMI hdmiDevice = new HDMI();
		USBPort usbPort = new HDMIToUSBAdapter(hdmiDevice);

		// Client는 USB포트를 기대하지만 실제론 HDMI장치가 연결됨.
		usbPort.connectWithUSB();
	}
}